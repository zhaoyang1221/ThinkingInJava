package exercise_10;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/6 0006
 * Description:
 */
public class GenericMethods10 {
    public <T, U> void f(T t, U u, String s) {
        System.out.println(t.getClass().getName());
        System.out.println(u.getClass().getName());
        System.out.println(s.getClass().getName() + " " + s);
    }

    public static void main(String[] args) {
        GenericMethods10 gm = new GenericMethods10();
        gm.f(1, 1.2f, "hello world");
    }
}