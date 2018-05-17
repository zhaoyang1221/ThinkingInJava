package exercise_11;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/11 0011
 * Description:
 */
interface A {
    void printA(String s);
}

class Test {
    private class PA implements A {
        @Override
        public void printA(String s) {
            System.out.println(s);
        }
    }

    A f() {
        return new PA();
    }
}
public class Ex11 {
    public static void main(String[] args) {
        Test t = new Test();
        t.f().printA("shshs");

//        ((PA)t.f()).printA("hello");
    }
}