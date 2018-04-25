package exercise_7;

/**
 * @author zhaoyang on 2018/4/25 0025.
 */

interface Rodent {
    String name = "Rodent";
    void run();
    void eat();
    void sleep();
}
class Mouse implements Rodent {
    private String name = "Mouse";

    @Override
    public void run() {
        System.out.println("Mouse run");
    }

    @Override
    public void eat() {
        System.out.println("Mouse eat");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse sleep");
    }

    @Override
    public String toString() {
        return name;
    }
}
class Gerbil implements Rodent {
    private String name = "Gerbil";

    @Override
    public void run() {
        System.out.println("Gerbil run");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil eat");
    }

    @Override
    public void sleep() {
        System.out.println("Gerbil sleep");
    }

    @Override
    public String toString() {
        return name;
    }
}
class Hamster implements Rodent {
    private String name = "Hamster";

    @Override
    public void run() {
        System.out.println(name + " run");
    }

    @Override
    public void eat() {
        System.out.println(name + " eat");
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleep");
    }

    @Override
    public String toString() {
        return name;
    }
}
public class Ex7 {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };

        for (Rodent r : rodents) {
            r.eat();
            r.run();
            r.sleep();
        }
    }
}
