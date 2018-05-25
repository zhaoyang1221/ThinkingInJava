package exercise_28;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/24 0024
 * Description:
 */

class MyException extends RuntimeException {
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
public class Ex28 {
    public static void f() throws MyException {
        System.out.println("f()");
        throw new MyException("exception from f()");
    }
    public static void main(String[] args) {
            f();
    }
}