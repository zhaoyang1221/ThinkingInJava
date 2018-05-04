package exercise_4;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/25 0025
 * To change this template use File | Settings | File Templates.
 * Description:
 */
abstract class Go {

}

class Go1 extends Go {
    void print() {
        System.out.println("go1");
    }
}

abstract class Come {
    abstract void print();
}

class Come1 extends Come{
    @Override
    void print() {
        System.out.println("Come1");
    }
}
public class Ex4 {
    static void alert(Go go) {
        ((Go1) go).print();
    }
    static void alertCome(Come come) {
        come.print();
    }

    public static void main(String[] args) {
        Go1 go1 = new Go1();
        Ex4.alert(go1);
        Come1 come1 = new Come1();
        Ex4.alertCome(come1);
    }
}