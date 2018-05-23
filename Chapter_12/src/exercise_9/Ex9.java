package exercise_9;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/23 0023
 * Description:
 */
class Exception1 extends Exception {
    public Exception1(String message) {
        super(message);
    }
}
class Exception2 extends Exception {
    public Exception2(String message) {
        super(message);
    }
}
class Exception3 extends Exception {
    public Exception3(String message) {
        super(message);
    }
}
public class Ex9 {
    static void f(int x) throws Exception1, Exception2, Exception3 {
        if (x < 0) {
            throw new Exception1("x < 0");
        } else if (x == 0) {
            throw new Exception2("x == 0");
        } else {
            throw new Exception3("x > 0");
        }
    }

    public static void main(String[] args) {
        try {
//            f(0);
            f(1);
            f(-1);

        } catch (Exception e) {
            System.out.println("Caught Exception");
            e.printStackTrace(System.out);
        }
    }

}