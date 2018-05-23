package exercise_4;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/23 0023
 * Description:
 */
class MyException extends Exception {
    private String s;

    public MyException(String s) {
        super(s);
        System.out.println("MyException()");
        this.s = s;
    }
    protected void show() {
        System.out.println("MyException + " + s);
    }
}
public class Ex4 {
    public static void f() throws MyException {
        System.out.println("f()");
        throw new MyException("exception from f()");
    }
    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            System.err.println("Caught MyException");
            e.printStackTrace();
            e.show();
        }
    }
}