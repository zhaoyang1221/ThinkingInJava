package exercise_7;//: typeinfo/SweetShop.java
// Examination of the way the class loader works.

import static net.mindview.util.Print.*;

class Candy {
    static {
        print("Loading Candy");
    }
}

class Gum {
    static {
        print("Loading Gum");
    }
}

class Cookie {
    static {
        print("Loading Cookie");
    }
}

public class SweetShop7 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: sweetName");
            System.exit(0);
        }
        Class c = null;
        try {
            c = Class.forName(args[0]);
            print("new class: " + args[0]);

        } catch (ClassNotFoundException e) {
            print("Couldn't find" + args[0]);
        }
//        print("inside main");
//        new Candy();
//        print("After creating Candy");
//        try {
//            Class.forName("Gum");
//        } catch (ClassNotFoundException e) {
//            print("Couldn't find Gum");
//        }
//        print("After Class.forName(\"Gum\")");
//        new Cookie();
//        print("After creating Cookie");
    }
} /* Output:
inside main
Loading Candy
After creating Candy
Loading Gum
After Class.forName("Gum")
Loading Cookie
After creating Cookie
*///:~
