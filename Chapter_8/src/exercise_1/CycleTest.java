package exercise_1;

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

}
class Bicycle extends Cycle {

}
class Tricycle extends Cycle {

}

public class CycleTest {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        unicycle.ride(unicycle);
        bicycle.ride(bicycle);
        tricycle.ride(tricycle);

    }
}