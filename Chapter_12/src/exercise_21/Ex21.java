package exercise_21;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/24 0024
 * Description:
 */
class BaseException extends Exception{}
class Base {
    public Base() throws BaseException{
        throw new BaseException();
    }
}

class Derived extends Base {
    public Derived() throws BaseException {
        super();
//        try {
//            super();
//        } catch (BaseException e) {
//
//        }
    }
}
public class Ex21 {
    public static void main(String[] args) {
        try {
            Derived d = new Derived();
        } catch (BaseException e) {
            System.out.println("BaseException caught in main()");
        }
    }
}