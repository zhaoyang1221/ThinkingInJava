package exercise_8;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/24 0024
 * Description:
 */
public class Ex8 {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void main(String[] args) {
        String[] strings = knights.split("you|the");
        System.out.println(Arrays.toString(strings));
    }
}