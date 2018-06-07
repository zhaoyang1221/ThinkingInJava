package exercise_20;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/7 0007
 * Description:
 */
interface A {
    void f();

    void g();
}

class B implements A {
    @Override
    public void f() {
        System.out.println("f()");
    }

    @Override
    public void g() {
        System.out.println("g()");
    }
    public void h() {
        System.out.println("h()");
    }
}

class C {
    static <T extends A> void k(T t) {
        t.g();
        t.f();
    }
}
public class Ex20 {
    public static void main(String[] args) {
        B b = new B();
        C.k(b);
    }
}