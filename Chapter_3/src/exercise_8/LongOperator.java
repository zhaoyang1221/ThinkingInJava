package exercise_8;

public class LongOperator {
    public static void main(String[] args) {
        long l1 = 0x34fff;
        long l2 = 045777;
        System.out.println("l1 hex: " + Long.toBinaryString(l1));
        System.out.println("l2 hex: " + Long.toBinaryString(l2));
    }
}
