package exercise_6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/23 0023
 * Description:
 */

class MyException extends Exception {
    private static Logger logger = Logger.getLogger("MyException");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
class MyException2 extends Exception {
    private static Logger logger = Logger.getLogger("MyException2");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
public class Ex6 {
    static void f() throws MyException {
        throw new MyException();
    }
    static void g() throws MyException2 {
        throw new MyException2();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            MyException.logException(e);
        }
        try {
            g();
        } catch (MyException2 e) {
            MyException2.logException(e);
        }
    }
}