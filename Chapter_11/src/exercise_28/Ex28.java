package exercise_28;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/22 0022
 * Description:
 */
public class Ex28 {
    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextDouble());
        }

        while (!priorityQueue.isEmpty()) {
            Double d = priorityQueue.poll();
            System.out.println(d);
        }
    }
}