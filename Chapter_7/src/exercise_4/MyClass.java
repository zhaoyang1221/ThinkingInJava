package exercise_4;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/18 0018
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class AClass {
    AClass() {
        System.out.println("AClass()");
    }
}
class BClass extends AClass {
    BClass() {
        System.out.println("BClass()");
    }
}
public class MyClass extends BClass{
    MyClass() {
        System.out.println("MyClass()");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

    }
}