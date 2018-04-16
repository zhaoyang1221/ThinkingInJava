package exercise_21;

enum Bills {
    ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}
public class Main {
    public static void main(String[] args) {
        for (Bills b : Bills.values()){
            System.out.println(b + ", " + b.ordinal());

            switch (b) {
                case ONE:
                    System.out.println("一元纸币");
                    break;
                case FIVE:
                    System.out.println("五元纸币");
                    break;
                case TEN:
                    System.out.println("10元纸币");
                    break;
                case TWENTY:
                    System.out.println("20元纸币");
                    break;
                case FIFTY:
                    System.out.println("50元纸币");
                    break;
                case HUNDRED:
                    System.out.println("100元纸币");
                    break;
                    default:
                        System.out.println("其他！");
            }
        }

    }
}
