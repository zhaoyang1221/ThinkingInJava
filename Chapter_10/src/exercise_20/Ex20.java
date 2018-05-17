package exercise_20;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/14 0014
 * Description:
 */

interface In {
    class Nested {
        Nested() {
            System.out.println("Nested()");
        }
        public void hi() {
            System.out.println("hi");
        }
    }
}

public class Ex20 {
    public static void main(String[] args) {
        In.Nested nested = new In.Nested();
        nested.hi();
    }
}