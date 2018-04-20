package exercise_12_14;


import static net.mindview.util.Print.print;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/20 0020
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        print("Creating " + this);
    }
    public void addRef() { refcount++; }
    protected void dispose() {
        if(--refcount == 0)
            print("Disposing " + this);
    }

    /**
     * 在对象被释放之前，Java 运行系统调用该对象的finalize( ) 方法
     */
    protected void finalize() {
        if (refcount > 0) {
            print("Error: " + refcount + " Shared " + id + " objects in use");
        }
    }
    public String toString() { return "Shared " + id; }
}
class Characteristic {
    private String s;

    public Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
    protected void dispose() {
        System.out.println("disposing Characteristic " + s);
    }
}

class Description {
    private String s;
    Description(String s) {
        this.s = s;
        print("Creating Description " + s);
    }
    protected void dispose() {
        print("disposing Description " + s);
    }
}
class Rodent {
    private Shared shared;
    private static long  counter = 0;
    private final long id  = counter++;
    private String name = "Rodent";
    private Characteristic characteristic = new Characteristic("has tail");
    private Description description = new Description("small mammal");
    Rodent (Shared shared) {
        print("Creating "+ id);
        this.shared = shared;
        this.shared.addRef();
    }
    @Override
    public String toString() {
        return this.name + " " +id;
    }
}

class Mouse extends Rodent {
    private String name = "Mouse";
    private static long  counter = 0;
    private final long id  = counter++;
    private Characteristic c = new Characteristic("likes cheese");
    private Description d = new Description("nocturnal");
    Mouse(Shared shared) {
        super(shared);
        print("Mouse()");
    }

    @Override
    public String toString() {
        return name + super.toString();
    }
}

class Gerbil extends Mouse {
    private String name = "Gerbil";
    private static long  counter = 0;
    private final long id  = counter++;
    private Characteristic c = new Characteristic("larger");
    private Description d = new Description("black");
    Gerbil(Shared shared) {
        super(shared);
        System.out.println("Gerbil Constructed");
    }

    @Override
    public String toString() {
        return this.name + " " + super.toString();
    }
}

class Hamster extends Mouse {
    private String name = "Hamster";
    private static long  counter = 0;
    private final long id  = counter++;
    private Characteristic c = new Characteristic("climbs trees");
    private Description d = new Description("likes nuts");
    Hamster(Shared shared) {
        super(shared);
        System.out.println("Hamster Constructed");
    }

    @Override
    public String toString() {
        return this.name + " " + super.toString();
    }
}

public class RodentTest {
    public static void main(String[] args) {
//        Rodent[] rodents = {
//                new Mouse(),
//                new Gerbil(),
//                new Hamster()
//        };
//        for (Rodent r : rodents) {
//            System.out.println(r);
//        }
        Shared shared = new Shared();
        Gerbil gerbil = new Gerbil(shared);
        print(gerbil);
    }
}