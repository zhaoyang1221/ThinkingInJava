package exercise_5;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/18 0018
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class A {
    A() {
        System.out.println("A()");
    }
}
class B {
    B() {
        System.out.println("B()");
    }
}
public class C extends A {
    B b = new B();

    public static void main(String[] args) {
        C c = new C();
    }
}