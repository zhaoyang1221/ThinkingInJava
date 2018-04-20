package exercise_9;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/20 0020
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class Rodent {
    private String name = "Rodent";
    @Override
    public String toString() {
        return name;
    }
}
class Mouse extends Rodent {
    private String name = "Mouse";

    @Override
    public String toString() {
        return name;
    }
}
class Gerbil extends Rodent {
    private String name = "Gerbil";

    @Override
    public String toString() {
        return name;
    }
}
class Hamster extends Rodent {
    private String name = "Hamster";

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
            System.out.println(r);
        }
    }
}