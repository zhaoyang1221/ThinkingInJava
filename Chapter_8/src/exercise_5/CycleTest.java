package exercise_5;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/20 0020
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class Cycle {
    private String name = "Cycle";
    private int wheels = 0;

    public int wheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Unicycle extends Cycle {
    private String name = "Unicycle";
    private int wheels = 1;

    @Override
    public int wheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";
    private int wheels = 2;

    @Override
    public int wheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Tricycle extends Cycle {
    private String name = "Tricycle";
    private int wheels = 3;


    @Override
    public int wheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class CycleTest {
    public static void ride(Cycle c) {
        System.out.println("Cycle ride()"+ c);
        System.out.println("Wheels: " + c.wheels());
    }
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        ride(unicycle);
        ride(bicycle);
        ride(tricycle);

    }
}