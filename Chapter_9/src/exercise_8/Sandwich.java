package exercise_8;

/**
 * @author zhaoyang on 2018/4/25 0025.
 */
import static net.mindview.util.Print.*;

interface FastFood {
    void cheeseburger();
    void fries();
    void softDrink();
}
class Meal {
    Meal() { print("Meal()"); }
}

class Bread {
    Bread() { print("Bread()"); }
}

class Cheese {
    Cheese() { print("Cheese()"); }
}

class Lettuce {
    Lettuce() { print("Lettuce()"); }
}

class Lunch extends Meal {
    Lunch() { print("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { print("PortableLunch()");}
}

public class Sandwich extends PortableLunch implements FastFood{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwich() { print("Sandwich()"); }

    @Override
    public void cheeseburger() {
        print("cheeseburger");
    }

    @Override
    public void fries() {
        print("fries");
    }

    @Override
    public void softDrink() {
        print("softDrink");
    }

    public static void main(String[] args) {
        Sandwich s = new Sandwich();
        s.cheeseburger();
        s.fries();
        s.softDrink();
    }
}