package exercise_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/20/0020
 * Description:
 */
public class Atomicity {
    volatile int i;

    public synchronized void f1() {
        i++;
    }

    public synchronized void f2() {
        i += 3;
    }

}

class AtomicityRunnable implements Runnable {
    private Atomicity atomicity = new Atomicity();

    @Override
    public void run() {
        atomicity.i = 0;
        atomicity.f1();
        System.out.println();
        Thread.yield();
        atomicity.f2();
    }
}