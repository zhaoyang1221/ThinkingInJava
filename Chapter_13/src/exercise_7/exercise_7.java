package exercise_7;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/24 0024
 * Description:
 */
public class exercise_7 {
    public static void main(String[] args) {
        String regex = "^[A-Z].*[\\.]$";
        String s1 = "Once upon a time.";
        String s2 = "abcd.";
        String s3 = "Abcd?";
        System.out.println(s1.matches(regex));
        System.out.println(s2.matches(regex));
        System.out.println(s3.matches(regex));


    }
}