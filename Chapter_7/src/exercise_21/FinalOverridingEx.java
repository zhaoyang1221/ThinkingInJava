package exercise_21;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/19 0019
 * To change this template use File | Settings | File Templates.
 * Description:
 */

import static net.mindview.util.Print.print;

class WithFinal {
    // Identical to "private" alone:
    private final void f() { print("WithFinals.f()"); }
    // Also automatically "final":
    private void g() { print("WithFinals.g()"); }
}

class OverridingPrivate extends WithFinal {
    //    @Override 报错
    private final void f() {
        print("OverridingPrivate.f()");
    }
    //    @Override  报错
    private void g() {
        print("OverridingPrivate.g()");
    }
}
public class FinalOverridingEx {
    public static void main(String[] args) {
       OverridingPrivate of = new OverridingPrivate();
//        of.f();
//        of.g();
//        // Upcast:
//        WithFinal wf = of;
//        wf.f();
//        wf.g();
    }

}