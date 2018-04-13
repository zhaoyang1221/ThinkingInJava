package exercise_13;

public class CharToBinary {
    public static void main(String[] args) {
        char c= 'c';
        chartoB(c);
    }
    public static void chartoB(char c) {
        int temp = c - '0';
        System.out.println(String.valueOf(c)+ ": " + Integer.toBinaryString(temp));
    }
}
