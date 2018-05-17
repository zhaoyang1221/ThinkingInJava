package exercise_21;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/14 0014
 * Description:
 */
interface In {
    String f();
    String g();
    class Nested {
        static void testIn(In i) {
            System.out.println(i.f() + " " + i.g());
        }
    }
}
public class Ex21 implements In{
    @Override
    public String f() {
        return "hello";
    }

    @Override
    public String g() {
        return "world";
    }

    public static void main(String[] args) {
        Ex21 ex21 = new Ex21();
        In.Nested.testIn(ex21);
    }
}