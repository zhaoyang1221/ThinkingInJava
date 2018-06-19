package exercise_10;

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

class ThreadMethod {
    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    public Future<Integer> runTask(int n) {
        return executorService.submit(new Ex5Fibonacci(n));

    }
}
public class Ex10 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadMethod threadMethod = new ThreadMethod();
        for (int i = 0; i < 10; i++) {

            System.out.println(threadMethod.runTask(i).get());
        }
    }
}