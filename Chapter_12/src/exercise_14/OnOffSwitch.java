package exercise_14;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/23 0023
 * Description:
 */
//: exceptions/OnOffSwitch.java
// Why use finally?

public class OnOffSwitch {
    private static Switch sw = new Switch();
    static Integer[] x = new Integer[1];
    public static void f()
            throws OnOffException1,OnOffException2 {}
    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions...
            f();
//            throw new RuntimeException(); //sw.off不会执行
            sw.off();
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
} /* Output:
on
off
*///:~
