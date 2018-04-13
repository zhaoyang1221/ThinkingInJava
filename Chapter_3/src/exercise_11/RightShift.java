package exercise_11;

public class RightShift {
    public static void main(String[] args) {
        int i = 0xf0;
        System.out.println("i: " + Integer.toBinaryString(i));
        while (i != 0) {
            i >>= 1;
            System.out.println("i: " + Integer.toBinaryString(i));
        }
    }
}
