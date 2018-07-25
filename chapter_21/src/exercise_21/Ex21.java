package exercise_21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/22/0022
 * Description:
 */
class A implements Runnable {
    protected volatile boolean signal = false;
    @Override
    public synchronized void run() {
        try {
            while (!signal) {
                System.out.println("A.run() wait()");
                wait();
                signal = true;
                System.out.println("A is done waiting");
            }
        } catch (InterruptedException e) {
            System.out.println("A run() interrupted()");
        } finally {
            System.out.println("leave A.run()");
        }
    }

    public synchronized void message() {
        System.out.println("Hi from A");
    }
}

class B implements Runnable {
    private A a;

    public B(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
            synchronized (a) {
                System.out.println("B.run() a.notifyAll()");
//                a.signal = true;
                a.notifyAll();
            }
        } catch (InterruptedException e) {
            System.out.println("B sleep interrupted");
        }
    }
}
public class Ex21 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        B b = new B(new A());
        executorService.execute(b.getA());
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("main() sleep");
        }
        b.getA().message();
        executorService.execute(b);
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("main() sleep");
        }
        executorService.shutdownNow();
    }
}