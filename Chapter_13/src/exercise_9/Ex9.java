package exercise_9;

import static exercise_8.Ex8.knights;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/24 0024
 * Description:
 */
public class Ex9 {
    public static void main(String[] args) {
        String result = knights.replaceAll("[aeiouAEIOU]", "_");
        System.out.println(result);
    }
}