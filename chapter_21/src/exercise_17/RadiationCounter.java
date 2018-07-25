package exercise_17;

import java.sql.SQLOutput;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/22/0022
 * Description:
 */
class RedCount {
    private int count = 0;
    private Random random = new Random(47);

    public synchronized int increment() {
        return ++count;
    }

    public synchronized int getCount() {
        return count;
    }

}

class Sensor implements Runnable {
    private static RedCount redCount = new RedCount();
    private static List<Sensor> sensors = new ArrayList<>();
    private int number = 0;
    private final int id;
    private static volatile boolean canceled = false;

    public static void cancel() {
        canceled = true;
    }

    public Sensor(int id) {
        this.id = id;
        sensors.add(this);
    }

    @Override
    public void run() {
        while (!canceled) {
            synchronized (this) {
                ++number;
            }
            System.out.println(this + " Total: " + redCount.increment());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("sleep interrupted");
            }
        }

        System.out.println("Stopping " + this);
    }

    public synchronized int getValue() {
        return number;
    }

    @Override
    public String toString() {
        return "Sensor " + id + ": " + getValue();
    }

    public static int getTotalCount() {
        return redCount.getCount();
    }

    public static int getSumSensor() {
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.getValue();
        }
        return sum;
    }

}

public class RadiationCounter {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new Sensor(i));
        }
        TimeUnit.SECONDS.sleep(3);
        Sensor.cancel();
        executorService.shutdown();
        if (!executorService.awaitTermination(250, TimeUnit.MILLISECONDS)) {
            System.out.println("Some tasks were not terminated");
        }
        System.out.println("Total: " + Sensor.getTotalCount());
        System.out.println("Sum of Sensors: " + Sensor.getSumSensor());
    }
}