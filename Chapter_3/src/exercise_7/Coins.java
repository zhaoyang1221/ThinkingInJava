package exercise_7;

import java.util.Random;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (;times >0; times--) {
            Random random = new Random();
            int coin = random.nextInt(2);
            System.out.println(coin);
        }

    }
}
