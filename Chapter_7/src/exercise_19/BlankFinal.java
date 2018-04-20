package exercise_19;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/19 0019
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class A{
    private int i;
    A (int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                '}';
    }
}
public class BlankFinal {
    private final A a;
    public BlankFinal () {
        a = new A(1);
    }
    public BlankFinal(int i) {
        a = new A(i);
    }

    public static void main(String[] args) {
        BlankFinal bf1 = new BlankFinal();
        BlankFinal bf2 = new BlankFinal(3);

        System.out.println("bf1: " + bf1.a);
        System.out.println("bf2: " + bf2.a);

    }
}