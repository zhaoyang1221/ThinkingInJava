package exercise_3;

import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

import java.util.Random;

public class RandomAndCompareWhile {
    public static void main(String[] args) {
        Random random= new Random();
        int temp = random.nextInt();
        while (true) {
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
