package exercise_9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/18 0018
 * Description:
 */
//: innerclasses/Sequence.java
// Holds a sequence of Objects.

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private ArrayList<Object> items = new ArrayList<>();
    public void add(Object x) {
       items.add(x);
    }

    public Iterator iterator() {
        return items.iterator();
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Iterator iterator = sequence.iterator();
        while(iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
