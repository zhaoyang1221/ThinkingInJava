package exercise_38;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/15/0015
 * Description:
 */
class BasicCoffee {
    private static long counter = 0;
    private final long id = counter ++;
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class Decorator extends BasicCoffee {
    protected BasicCoffee basicCoffee;

    public Decorator(BasicCoffee basicCoffee) {
        this.basicCoffee = basicCoffee;
    }
    public void set(String value) {
        basicCoffee.setValue(value);
    }
    public String get() {
        return basicCoffee.getValue();
    }
}

class SteamedMilk extends Decorator {
    private final String steamMilk = "steamedMilk";

    public SteamedMilk(BasicCoffee basicCoffee) {
        super(basicCoffee);
    }
    public String getSteamMilk() {
        return steamMilk;
    }
}

class Foam extends Decorator {
    private final String foam = "foam";

    public Foam(BasicCoffee basicCoffee) {
        super(basicCoffee);
    }

    public String getFoam() {
        return foam;
    }
}

class Chocolate extends Decorator {
    private final String chocolate = "chocolate";

    public Chocolate(BasicCoffee basicCoffee) {
        super(basicCoffee);
    }

    public String getChocolate() {
        return chocolate;
    }
}

class Caramel extends Decorator {
    private final String caramel = "caramel";

    public Caramel(BasicCoffee basicCoffee) {
        super(basicCoffee);
    }

    public String getCaramel() {
        return caramel;
    }
}

class WhippedCream extends Decorator {
    private final String whippCream = "whippedCream";

    public WhippedCream(BasicCoffee basicCoffee) {
        super(basicCoffee);
    }

    public String getWhippCream() {
        return whippCream;
    }
}
public class CoffeeDecoration {
    public static void main(String[] args) {
        SteamedMilk sm = new SteamedMilk(new BasicCoffee());
        SteamedMilk sm2 = new SteamedMilk(
                new Foam(new BasicCoffee()));
        Chocolate c = new Chocolate(new BasicCoffee());
        WhippedCream wc = new WhippedCream(new Caramel(
                new Chocolate(new Foam(new SteamedMilk(
                        new BasicCoffee())))));
    }
}