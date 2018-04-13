package exercise_12;

public class LeftAndRightShift {
    public static void main(String[] args) {
        int i = 0xffffffff;
//        int j = -1;
        System.out.println("i: "+ Integer.toBinaryString(i));
//        System.out.println("j: "+ Integer.toBinaryString(j));
        i <<= 10;
        System.out.println("i: " + Integer.toBinaryString(i));
        while (i != 0){
            i >>>= 1;
            System.out.println("i: " + Integer.toBinaryString(i));
        }

    }
}
