package exercise_10;

import sun.security.krb5.internal.crypto.Aes128;

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
class BException extends Exception {
    public BException(String message) {
        super(message);
    }
}
public class Ex10 {
    static void g() throws AException {
        throw new AException("from g()");
    }
    static void f() throws BException {
        try {
            g();
        } catch (AException e) {
            System.out.println("Caught AException in f() from g()");
            e.printStackTrace();
            throw new BException("from f()");
        }
    }

    public static void main(String[] args) {
        try {

            f();
        } catch (BException e) {
            System.out.println("Caught exception ");
            e.printStackTrace();
        }
    }
}