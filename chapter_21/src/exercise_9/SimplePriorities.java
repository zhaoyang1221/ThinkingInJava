package exercise_9;//: concurrency/SimplePriorities.java
// Shows the use of thread priorities.

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class SimplePrioritiesThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Random random = new Random();
        int priority = random.nextInt(3);
        Thread thread = new Thread(r);
        switch (priority) {
            case 0:
                thread.setPriority(Thread.MIN_PRIORITY);
                break;
            case 1:
                thread.setPriority(Thread.NORM_PRIORITY);
                break;
            case 2:
                thread.setPriority(Thread.MAX_PRIORITY);
                break;
            default:
        }
        return thread;
    }
}
public class SimplePriorities implements Runnable {
    private int countDown = 5;
    private volatile double d; // No optimization
    private int priority;
//
//    public SimplePriorities(int priority) {
//        this.priority = priority;
//    }

    public String toString() {
        return Thread.currentThread() + ": " + countDown;
    }

    public void run() {
//        Thread.currentThread().setPriority(priority);
        while (true) {
            // An expensive, interruptable operation:
            for (int i = 1; i < 100000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0)
                    Thread.yield();
            }
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(new SimplePrioritiesThreadFactory());
        for (int i = 0; i < 5; i++)
            exec.execute(
                    new SimplePriorities());
        exec.execute(
                new SimplePriorities());
        exec.shutdown();
    }
} /* Output: (70% match)
Thread[pool-1-thread-6,10,main]: 5
Thread[pool-1-thread-6,10,main]: 4
Thread[pool-1-thread-6,10,main]: 3
Thread[pool-1-thread-6,10,main]: 2
Thread[pool-1-thread-6,10,main]: 1
Thread[pool-1-thread-3,1,main]: 5
Thread[pool-1-thread-2,1,main]: 5
Thread[pool-1-thread-1,1,main]: 5
Thread[pool-1-thread-5,1,main]: 5
Thread[pool-1-thread-4,1,main]: 5
...
*///:~
