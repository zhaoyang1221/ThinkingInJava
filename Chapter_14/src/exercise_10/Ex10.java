package exercise_10;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/29 0029
 * Description:
 */
public class Ex10 {
    public static void main(String[] args) {
        char[] c = new char[10];
        System.out.println("c: " + c.getClass().getSuperclass());
        System.out.println("char[] c instanceof Object: " + c instanceof Object);
    }
}