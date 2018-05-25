package exercise_22;

import com.sun.org.apache.bcel.internal.generic.IADD;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/24 0024
 * Description:
 */
public class FailingConstructor {
    Integer[] integers = new Integer[2];
    String s;

    public FailingConstructor(String s) {
        this.s = s;
        integers[0] = 0;
        integers[1] = 1;
        integers[2] = 2;
    }

    public static void main(String[] args) {
        try {
            FailingConstructor fc = new FailingConstructor("hello");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}