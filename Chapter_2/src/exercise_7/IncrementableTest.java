package exercise_7;

class StaticTest {
    static int i = 47;
}
class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}
public class IncrementableTest {
    public static void main(String[] args) {
        StaticTest st1 =  new StaticTest();
        StaticTest st2 = new StaticTest();
        st1.i++;
        System.out.println("st1.i = " + st1.i);
        st2.i++;
        System.out.println("st2.i = " + st2.i);
        Incrementable.increment();
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
    }




}
