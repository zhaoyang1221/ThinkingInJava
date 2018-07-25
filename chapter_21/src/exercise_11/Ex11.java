package exercise_11;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/20/0020
 * Description:
 */
abstract class NumRangeGenerator {
    private volatile boolean canceled = false;
    public abstract int[] next();
    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
class NumRangeChecker implements Runnable {
    private NumRangeGenerator generator;
    private final int id;

    public NumRangeChecker(NumRangeGenerator generator, int id) {
        this.generator = generator;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Testing...");
        while (!generator.isCanceled()) {
            int[] range = generator.next();
            if (range[0] > range[1]) {
                System.out.println("Error in test #" + id + ": min " + range[0]
                        + " > " + "max " + range[1] );
                generator.cancel();
            }
        }
    }

    public static void test(NumRangeGenerator generator, int count) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            executorService.execute(new NumRangeChecker(generator, i));
        }
        executorService.shutdown();
    }

    public static void test(NumRangeGenerator generator) {
        test(generator, 10);
    }

}

public class Ex11 extends NumRangeGenerator{
    private int min = 0;
    private int max = 0;
    private int[] range = {min, max};
    private Random random = new Random();
    @Override
    public synchronized int[] next() {
        min = random.nextInt(100);
        max = random.nextInt(100);
        Thread.yield();
        if (min > max) max = min;
        return new int[]{max, min};
    }

    public static void main(String[] args) {
        NumRangeChecker.test(new Ex11());
    }
}