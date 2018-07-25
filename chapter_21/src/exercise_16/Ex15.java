package exercise_16;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/21/0021
 * Description:
 */
class SynTest {
    private Lock lock = new ReentrantLock();
    public void f1() {
        try {
            lock.lock();
            for (int i = 0; i < 5; i++) {
                System.out.println("f1()");
                Thread.yield();
            }
        } finally {
            lock.unlock();
        }


    }
    public void g1() {
        try {
            lock.lock();
            for (int i = 0; i < 5; i++) {
                System.out.println("g1()");
                Thread.yield();
            }
        } finally {
            lock.unlock();
        }


    }
    public void h1() {
        try {
            lock.lock();
            for (int i = 0; i < 5; i++) {
                System.out.println("h1()");
                Thread.yield();
            }
        } finally {
            lock.unlock();
        }

    }
}
public class Ex15 {
    public static void main(String[] args) {
        final SynTest st1 = new SynTest();
        new Thread() {
            public void run() {
                st1.f1();
            }

        }.start();

        new Thread() {
            public void run() {
                st1.g1();
            }
        }.start();

        new Thread() {
            public void run() {
                st1.h1();
            }
        }.start();

    }
}