package exercise_16;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/2 0002
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class RandomChars {
    private static Random random = new Random();
    public char next() {
        return (char)random.nextInt(128);
    }

    public static void main(String[] args) {
        RandomChars rc = new RandomChars();
        for (int i = 0; i < 10; i++) {
            System.out.print(rc.next());
        }
    }
}