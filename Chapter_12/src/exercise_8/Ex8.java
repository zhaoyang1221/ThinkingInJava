package exercise_8;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/23 0023
 * Description:
 */
class Exception4 extends Exception {
    private String msg;
    Exception4(String msg) {
        super(msg);
        System.out.println("Exception4()");
        this.msg = msg;
    }
    protected void showS() {
        System.out.println("Message from Exception4: " + msg);
    }
}
class TestException {
    public static void f() throws Exception4 {
        System.out.println("f()");
        throw new Exception4("exception 4");
    }


}
public class Ex8 {

    public static void main(String[] args) {
        try {
            TestException.f();
        } catch (Exception4 e) {
            System.err.println("Caught Exception4");
            e.printStackTrace();
        }
    }
}