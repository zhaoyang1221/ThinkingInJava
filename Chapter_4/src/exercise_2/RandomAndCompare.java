package exercise_2;

import java.util.Random;

public class RandomAndCompare {
    public static void main(String[] args) {
        Random random= new Random();
        int temp = random.nextInt();
        for (int i=1; i<25;i++) {
            int x = random.nextInt();
            if (temp < x) {
                System.out.println("小于");
            } else if (temp > x) {
                System.out.println("大于");
            } else {
                System.out.println("等于");
            }

            temp = x;
        }
    }
}
