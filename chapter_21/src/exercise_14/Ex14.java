package exercise_14;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/20/0020
 * Description:
 */
public class Ex14 implements Runnable {
    private static int timers = 0;
    private static int tasks = 0;
    @Override
    public void run() {
        try {
            while (timers < 4000) {
                ++timers;
                Timer t = new Timer();
                t.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        ++tasks;
                        if (timers % 100 == 0) {
                            System.out.println(timers + " timers did " + tasks + " tasks");
                        }
                    }
                }, 0);

                try {
                    TimeUnit.MILLISECONDS.sleep(30);
                } catch (InterruptedException e) {
                    System.out.println("sleep interrupted");
                }
                t.cancel();
            }
        } finally {
            System.out.println("Done. " + timers + " timers completed " + tasks + " tasks");
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Ex14());
        executorService.shutdown();
    }
}