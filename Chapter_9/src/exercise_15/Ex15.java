package exercise_15;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/2 0002
 * To change this template use File | Settings | File Templates.
 * Description:
 */
interface DoA {
    void a();
    void a1();
}

interface DoB {
    void b();
    void b1();
}

interface DoC {
    void c();
    void c1();
}

interface DoAll extends DoA, DoB, DoC {
    void all();
}

abstract class person {
    private int i = 0;
    abstract void doSomething ();
}

class personDo extends person implements DoAll {
    @Override
    public void a() {

    }

    @Override
    public void a1() {

    }

    @Override
    public void b() {

    }

    @Override
    public void b1() {

    }

    @Override
    public void c() {

    }

    @Override
    public void c1() {

    }

    @Override
    public void all() {

    }

    @Override
    void doSomething() {
        System.out.println("dosomething");
    }
}

public class Ex15 {
    public static void m1(DoA a) {};
    public static void m2(DoB b) {};
    public static void m3(DoC c) {};
    public static void m4(DoA all) {};

    public static void main(String[] args) {
        personDo personDo = new personDo();
        m1(personDo);
        m2(personDo);
        m3(personDo);
        m4(personDo);
    }

}