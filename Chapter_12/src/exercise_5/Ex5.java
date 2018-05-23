package exercise_5;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/23 0023
 * Description:
 */
public class Ex5 {
    private static int[] ints = new int[3];
    static int x = 5;

    public static void main(String[] args) {
        while (true) {
            try {
                ints[x] = 1;
                System.out.println(ints[x]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Caught ArrayIndexOutOfBoundsException");
                e.printStackTrace();
                x--;
            }
        }
    }
}