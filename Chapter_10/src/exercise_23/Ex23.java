package exercise_23;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/14 0014
 * Description:
 */
interface U {
    void f();
    void  g();
    String toString();
}

class A {
    U makeU() {
        return new U() {
            @Override
            public void f() {
                System.out.println("f()");
            }

            @Override
            public void g() {
                System.out.println("g()");
            }

            @Override
            public String toString() {
                return "U()";
            }
        };
    }
}
class B {
    private U[] us;
    B(int i) {
        us = new U[i];
    }
    void addU(U u, int i) {
        us[i] = u;
    }
    void eraseU(int i) {
        us[i] = null;
    }
    void testU() {
        for (U u : us) {
            u.f();
            u.g();
            System.out.println(u.toString());
        }
    }

}
public class Ex23 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        B b = new B(3);
        b.addU(a1.makeU(), 0);
        b.addU(a2.makeU(), 1);
        b.addU(a3.makeU(), 2);
        b.testU();
//        b.eraseU(2);
//        b.testU();
    }
}