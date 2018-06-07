package exercise_25;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/7 0007
 * Description:
 */
interface A {

}

interface B {

}

class C implements A, B {
    @Override
    public String toString() {
        return "exercise_25.C{}";
    }
}
public class Ex_25 {
    <T extends A> void f(T t) {
        System.out.println("a(): " + t);
    }
    <T extends B> void g(T t) {
        System.out.println("b(): " + t);
    }

    public static void main(String[] args) {
        C c = new C();
        Ex_25 ex_25 = new Ex_25();
        ex_25.f(c);
        ex_25.g(c);
    }
}