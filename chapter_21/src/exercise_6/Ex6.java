package exercise_6;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/19/0019
 * Description:
 */
public class Ex6 implements Runnable{
    Random random = new Random();
    @Override
    public void run() {
        int time = 1000 * random.nextInt(10);
        try {
            TimeUnit.MILLISECONDS.sleep(time);
            System.out.println("sleep time: " + time/1000 + " seconds");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int n = 10;
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < n; i++) {
            executorService.execute(new Ex6());
        }
        executorService.shutdown();
    }
}