package exercise_5;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/19/0019
 * Description:
 */
class Ex5Fibonacci implements Callable<Integer> {
    private int n = 0;

    public Ex5Fibonacci(int n) {
        this.n = n;
    }

    private int fib(int x) {
        if (x < 2) return 1;
        return fib(x - 1) + fib(x - 2);
    }

    @Override
    public Integer call() throws Exception {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += fib(i);
        }
        return result;
    }
}
public class Ex5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(executorService.submit(new Ex5Fibonacci(i)));
        }
        for (Future<Integer> fs : arrayList) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                executorService.shutdown();
            }
        }
    }
}