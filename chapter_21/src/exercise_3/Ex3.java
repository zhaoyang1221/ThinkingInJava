package exercise_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/19/0019
 * Description:
 */
class MyRunnable implements Runnable {
    public MyRunnable() {
        System.out.println("constructing myRunnable1");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("myRunnable1");
            Thread.yield();
        }
        System.out.println("myRunnable1 complete.");
    }

}

class MyRunnable2 implements Runnable {
    public MyRunnable2() {
        System.out.println("constructing myRunnable2");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("myRunnable2");
            Thread.yield();
        }
        System.out.println("myRunnable2 complete.");
    }

}

class MyRunnable3 implements Runnable {
    public MyRunnable3() {
        System.out.println("constructing myRunnable3");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("myRunnable3");
            Thread.yield();
        }
        System.out.println("myRunnable3 complete.");
    }

}

public class Ex3 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new MyRunnable());
        exec.execute(new MyRunnable2());
        exec.execute(new MyRunnable3());
        exec.shutdown();

        ExecutorService exec2 = Executors.newFixedThreadPool(3);
        exec2.execute(new MyRunnable());
        exec2.execute(new MyRunnable2());
        exec2.execute(new MyRunnable3());
        exec2.shutdown();

        ExecutorService exec3 = Executors.newSingleThreadExecutor();
        exec3.execute(new MyRunnable());
        exec3.execute(new MyRunnable2());
        exec3.execute(new MyRunnable3());
        exec3.shutdown();
    }
}