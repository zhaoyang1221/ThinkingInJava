package exercise_4;

public class PrimeNumber {
    public static void main(String[] args) {
        findPrimeNumber2();
    }

    public static  void findPrimeNumber() {
        for (int i = 2; i< 100;i++) {
            int j=2;
            for (; j<i;j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                System.out.println(i);
            }
        }

    }

    public static void findPrimeNumber2() {
        for (int i=2;i< 1000;i++) {
            int factors = 0;
            for (int j = 1; j<=(i+1)/2; j++) {
                if (i % j == 0) {
                    factors++;
                }
            }
            if (factors < 2) {
                System.out.println(i);
            }
        }
    }
}
