package exercise_7;

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

class B {
    B(int i) {
        System.out.println("B()" + i);
    }
}

public class C extends A {
    C() {
        super(1);
    }

    B b = new B(3);

    public static void main(String[] args) {
        C c = new C();
    }
}