package exercise_3;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/25 0025
 * To change this template use File | Settings | File Templates.
 * Description:
 */
abstract class A {
    A() {
        print();
    }
    abstract void print();
}

class B extends A {
    private int i = 2;
    @Override
    void print() {
        System.out.println("A: " + i);
    }
}

class C extends A {
    private int i = 3;
    @Override
    void print() {
        System.out.println("C: " + i);
    }
}
public class Ex3 {
    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}