package exercise_17;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/20 0020
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class Cycle {
    public void ride(Cycle c) {
        System.out.println("Cycle ride()");
    }
}

class Unicycle extends Cycle {
    public void balance() {
        System.out.println("Unicycle balance");
    }

}

class Bicycle extends Cycle {
    public void balance() {
        System.out.println("Bicycle balance");
    }
}

class Tricycle extends Cycle {

}

public class CycleTest {
    public static void main(String[] args) {
        Cycle[] c = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
//        c[0].balance();   报错
//        c[1].balance();   报错
//        c[2].balance();   报错
        ((Unicycle)c[0]).balance();
        ((Bicycle)c[1]).balance();
//        ((Tricycle)c[1]).balance();


    }
}