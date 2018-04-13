package exercise_5;

public class BinaryTest2 {
    public static void main(String[] args) {
        int i = 0x55;
        int j = 0xAA;
        System.out.println("i:" + Integer.toBinaryString(i));
        System.out.println("j:" + Integer.toBinaryString(j));

        binaryPrint(i);

    }
    public static void binaryPrint(int x) {
        if (x == 0) {
            System.out.println(x);
            return;
        }
        int numberOfZeros = Integer.numberOfLeadingZeros(x);
        x <<= numberOfZeros;
        while (x != 0) {
            int temp = Integer.numberOfLeadingZeros(x) == 0 ? 1 : 0;
            x <<= 1;
            System.out.print(temp);
        }
    }
}
