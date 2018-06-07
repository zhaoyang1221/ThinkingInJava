package exercise_24;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/5 0005
 * Description:
 */


class Secret implements A {
    @Override
    public void e() {
        System.out.println("public Secret.e()");
    }
    void f() {
        System.out.println("package Secret.f()");
    }
    protected void g() {
        System.out.println("protected Secret.g()");
    }

    private void h() {
        System.out.println("private Secret.h()");
    }
}
public class AMaker24 {
    public static A makeSecret() {
        return new Secret();
    }
}