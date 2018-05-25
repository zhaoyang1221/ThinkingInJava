package exercise_29;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/24 0024
 * Description:
 */
//: exceptions/StormyInning29.java
// Overridden methods may throw only the exceptions
// specified in their base-class versions, or exceptions
// derived from the base-class exceptions.

class BaseballException extends RuntimeException {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    public Inning()  {}
    public void event() {
        // Doesn't actually have to throw anything
    }
    public abstract void atBat();
    public void walk() {} // Throws no checked exceptions
}

class StormException extends RuntimeException {}
class RainedOut extends RuntimeException {}
class PopFoul extends RuntimeException {}

interface Storm {
    public void event() ;
    public void rainHard();
}

public class StormyInning29 extends Inning implements Storm {
    // OK to add new exceptions for constructors, but you
    // must deal with the base constructor exceptions:
    public StormyInning29() {}
    public StormyInning29(String s) {}
    // Regular methods must conform to base class:
    public void walk() {} //Compile error
    // Interface CANNOT add exceptions to existing
    // methods from the base class:
    public void event() {}
    // If the method doesn't already exist in the
    // base class, the exception is OK:
    public void rainHard() throws RainedOut {}
    // You can choose to not throw any exceptions,
    // even if the base version does:
    // Overridden methods can throw inherited exceptions:
    public void atBat(){}
    public static void main(String[] args) {
        try {
            StormyInning29 si = new StormyInning29();
            si.atBat();
        } catch(PopFoul e) {
            System.out.println("Pop foul");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        // Strike not thrown in derived version.
        try {
            // What happens if you upcast?
            Inning i = new StormyInning29();
            i.atBat();
            // You must catch the exceptions from the
            // base-class version of the method:
        } catch(Strike e) {
            System.out.println("Strike");
        } catch(Foul e) {
            System.out.println("Foul");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
} ///:~
