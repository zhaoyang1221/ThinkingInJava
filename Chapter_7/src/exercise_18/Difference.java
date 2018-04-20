package exercise_18;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/19 0019
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Difference {
    private static Random random = new Random();
    private final int fi = random.nextInt();
    static final int sfi = random.nextInt();

    @Override
    public String toString() {
        return fi + " " + sfi;
    }

    public static void main(String[] args) {
        Difference difference1 = new Difference();
        Difference difference2 = new Difference();
        Difference difference3 = new Difference();

        System.out.println(difference1);
        System.out.println(difference2);
        System.out.println(difference3);

    }
}