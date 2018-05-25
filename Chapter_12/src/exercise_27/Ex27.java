package exercise_27;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/24 0024
 * Description:
 */
public class Ex27 {
    private static int[] ia = new int[2];
    public static void main(String[] args) {
        try {
            ia[2] = 3;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println(
                    "Caught ArrayIndexOutOfBoundsException");
            throw new RuntimeException(e);
        }
    }
}