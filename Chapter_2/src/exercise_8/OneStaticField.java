package exercise_8;

class StaticTest {
    static int i = 47;
}
class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}
public class OneStaticField {
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("st1.i = " + st1.i);
        System.out.println("st1.i = " + st1.i);
        Incrementable.increment();
        System.out.println("===call incrementable ===");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st1.i = " + st1.i);
    }
}
