package exercise_10;

public class BinaryTest {
    public static void main(String[] args) {
        int i = 0x55;
        int j = 0xAA;
        System.out.println("i:" + Integer.toBinaryString(i));
        System.out.println("j:" + Integer.toBinaryString(j));

        System.out.println("i&j: "+ Integer.toBinaryString(i&j));
        System.out.println("i|j: "+ Integer.toBinaryString(i|j));
        System.out.println("~i: "+ Integer.toBinaryString(~i));
        System.out.println("~j: "+ Integer.toBinaryString(~j));
        System.out.println("i^j: "+ Integer.toBinaryString(i^j));

    }
}
