package exercise_25;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/24 0024
 * Description:
 */
class AException extends Exception {}
class BException extends AException{}
class CException extends BException {}

class A {
    void f() throws AException {
        throw new AException();
    }
}
class B extends A {
    void f() throws BException{
        throw new BException();
    }
}
class C extends B {
    void f() throws CException {
        throw new CException();
    }
}
public class Ex25 {
    public static void main(String[] args) {
        A c = new C();
        try {
            c.f();
        } catch (CException e) {
            System.out.println("CException");
        } catch (BException e) {
            System.out.println("BException");
        } catch (AException e) {
            System.out.println("AException");
        }
    }
}