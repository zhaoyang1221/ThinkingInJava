package exercise_8;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/18 0018
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class A {
    A(int i) {
        System.out.println("A()" + i);
    }
}
public class B extends A {
    B() {
        super(1);
        System.out.println("B()");
    }
    B(int i) {
        super(i);
        System.out.println("B()_" + i);
    }

    public static void main(String[] args) {
//        B b = new B();
        B c = new B(3);
    }
}