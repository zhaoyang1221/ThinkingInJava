package exercise_9;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/5 0005
 * Description:
 */
public class GenericMethods {
    public <T, U, V> void f(T X, U u, V v) {
        System.out.println(X.getClass().getName());
        System.out.println(u.getClass().getName());
        System.out.println(v.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f(1,1.2f,"hello world");
    }
}