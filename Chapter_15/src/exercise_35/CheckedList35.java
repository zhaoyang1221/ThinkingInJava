package exercise_35;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/14 0014
 * Description:
 */
//: generics/CheckedList.java
// Using Collection.checkedList().
import exercise_16.coffee.*;
import typeinfo.pets.*;
import java.util.*;

public class CheckedList35 {
    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyCoffee) {
        probablyCoffee.add(new Americano());
    }
    public static void main(String[] args) {
        List<Cappuccino> cappuccinos1 = new ArrayList<>();
        oldStyleMethod(cappuccinos1); // Quietly accepts a Cat
        List<Cappuccino> cappuccinos2 = Collections.checkedList(
                new ArrayList<>(), Cappuccino.class);
        try {
            oldStyleMethod(cappuccinos2); // Throws an exception
        } catch(Exception e) {
            System.out.println(e);
        }
        // Derived types work fine:
        List<Coffee> pets = Collections.checkedList(
                new ArrayList<>(), Coffee.class);
        pets.add(new Latte());
        pets.add(new Mocha());
    }
} /* Output:
java.lang.ClassCastException: Attempt to insert class typeinfo.pets.Cat element into collection with element type class typeinfo.pets.Dog
*///:~
