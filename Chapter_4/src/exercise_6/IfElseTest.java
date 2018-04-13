package exercise_6;

public class IfElseTest {
    static int test (int testval, int begin, int end) {
        if (testval < begin) {
            return -1;
        } else if (testval > end) {
            return +1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(test(10, 1,5));
        System.out.println(test(10, 5, 20));

    }
}
