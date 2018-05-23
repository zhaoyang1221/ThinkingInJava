package exercise_1;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/23 0023
 * Description:
 */
public class Ex1 {
    public static void main(String[] args) {
        try {
            String s = "hello, world";
            throw new Exception(s);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            System.out.println("finally block");
        }
    }
}