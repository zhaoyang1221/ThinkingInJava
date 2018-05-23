package exercise_11;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/23 0023
 * Description:
 */
class AException extends Exception {
    public AException(String message) {
        super(message);
    }
}

public class Ex11 {
    static void g() throws AException {
        throw new AException("from g()");
    }
    static void f() {
        try {
            g();
        } catch (AException e) {
            System.out.println("Caught AException in f() from g()");
            e.printStackTrace();
            throw new RuntimeException("from f()");
        }
    }

    public static void main(String[] args) {
        f();

    }
}