package exercise_2;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/23 0023
 * Description:
 */
public class Ex2 {
    private static Integer i = null;

    public static void main(String[] args) {
        try {
            System.out.println(i.toString());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}