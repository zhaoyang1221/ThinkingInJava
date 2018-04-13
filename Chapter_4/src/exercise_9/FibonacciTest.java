package exercise_9;

public class FibonacciTest {
    public static void main(String[] args) {
        getFibonacci(10);

    }
    public static void getFibonacci(int n) {
        int a = 0;
        int fi = 1;
        for (;n>0;n--) {
            System.out.println(fi);
            fi += a;
            a = fi - a;
        }
    }
}