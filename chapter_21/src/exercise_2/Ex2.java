package exercise_2;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/19/0019
 * Description:
 */
class Ex2Fibonacci implements Runnable {
    private int n = 0;

    public Ex2Fibonacci(int n) {
        this.n = n;
    }
    private int fib(int x) {
        if (x < 2) {
            return 1;
        }
        return fib(x - 1) + fib(x - 2);
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }
}
public class Ex2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Ex2Fibonacci(10));
        Thread t2 = new Thread(new Ex2Fibonacci(10));
        Thread t3 = new Thread(new Ex2Fibonacci(10));

        t1.start();
        t2.start();
//        t3.start();
    }
}