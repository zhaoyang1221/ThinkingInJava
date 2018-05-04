package exercise_1;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/20 0020
 * To change this template use File | Settings | File Templates.
 * Description:
 */
abstract class Rodent {
    private String name = "Rodent";
    abstract void walk();
    public abstract String toString();
}
class Mouse extends Rodent {
    private String name = "Mouse";

    @Override
    void walk() {
        System.out.println("Mouse walk");
    }

    @Override
    public String toString() {
        return name;
    }
}
class Gerbil extends Rodent {
    private String name = "Gerbil";

    @Override
    void walk() {
        System.out.println("Gerbil walk");
    }

    @Override
    public String toString() {
        return name;
    }
}
class Hamster extends Rodent {
    private String name = "Hamster";

    @Override
    void walk() {
        System.out.println("Hamster walk");
    }

    @Override
    public String toString() {
        return name;
    }
}
public class RodentTest {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        for (Rodent r : rodents) {
            r.walk();
        }
    }
}