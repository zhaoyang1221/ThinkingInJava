package exercise_6;

/**
 * @author zhaoyang on 2018/4/25 0025.
 */

interface A {
    void printA();
    void printB();
    void printC();
}

class B implements A {
    @Override
    public void printA() {
        System.out.println("A");
    }
//    均报错
//    void printA() {}
//    protected void printA(){}
//    private void printA(){}

    @Override
    public void printB() {
        System.out.println("B");
    }

    @Override
    public void printC() {
        System.out.println("C");
    }
}
public class Ex6 {
    public static void main(String[] args) {
        B b = new B();
        b.printA();
        b.printB();
        b.printC();
    }
}

