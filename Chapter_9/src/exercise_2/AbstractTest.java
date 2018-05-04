package exercise_2;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/25 0025
 * To change this template use File | Settings | File Templates.
 * Description:
 */

abstract class Go1 {
    void alert() {
        System.out.println("go1");
    }
}

abstract class Go2 {

}

class Go3 extends Go1 {
    @Override
    void alert() {
        System.out.println("go3");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
//        Go1 go1 = new Go1(); 报错
        Go3 go3 = new Go3();
    }
}