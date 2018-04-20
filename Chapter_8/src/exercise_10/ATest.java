package exercise_10;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/20 0020
 * To change this template use File | Settings | File Templates.
 * Description:
 */

class A {
    void eat() {
        run();
        System.out.println("eat()");
    }
    void run() {
        System.out.println("run()");
    }

}
class B extends A {
    @Override
    void run() {
        System.out.println("override run()");
    }
}
public class ATest {
    public static void main(String[] args) {
        A a = new B();
        a.eat();
    }
}