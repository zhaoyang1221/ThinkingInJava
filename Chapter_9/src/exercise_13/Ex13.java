package exercise_13;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/2 0002
 * To change this template use File | Settings | File Templates.
 * Description:
 */
interface A {
    void a();
}

interface B extends A {
    void b();
}

interface C extends A {
    void c();
}

interface D extends B, C {
    void d();
}
class E implements D {

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }
}
public class Ex13 {
    public static void main(String[] args) {
        E e = new E();
        ((A)e).a();
        ((B)e).b();
        ((C)e).c();
        ((D)e).d();


    }
}