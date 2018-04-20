package exercise_23;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/19 0019
 * To change this template use File | Settings | File Templates.
 * Description:
 */
import static net.mindview.util.Print.*;

class A {
static int j = printInit("A.j initialized");
static int printInit(String s) {
        print(s);
        return 1;
        }
        A() { print("A() constructor"); }
        }

class B extends A {
    static int k = printInit("B.k initialized");
    B() { print("B() constructor"); }
}

class C {
    static int n = printInitC("C.n initialized");
    static A a = new A();
    C() { print("C() constructor"); }
    static int printInitC(String s) {
        print(s);
        return 1;
    }
}

class D {
    D() { print("D() constructor"); }
}

public class LoadClass extends B {
    static int i = printInit("LoadClass.i initialized");
    LoadClass() { print("LoadClass() constructor"); }
    public static void main(String[] args) {
        // accessing static main causes loading (and initialization)
        // of A, B, & LoadClass
        print("hi");
        // call constructors from loaded classes:
        LoadClass lc = new LoadClass();
        // call to static field loads & initializes C:
        print(C.a);
        // call to constructor loads D:
        D d = new D();
    }
}