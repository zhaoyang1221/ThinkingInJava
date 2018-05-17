package exercise_13;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/14 0014
 * Description:
 */
interface A {
    void printA();
}
public class Ex13 {
    public A a() {
        return new A() {
            @Override
            public void printA() {
                System.out.println("hello");
            }
        };
    }

    public static void main(String[] args) {
        Ex13 ex13 = new Ex13();
        ex13.a().printA();
    }
}