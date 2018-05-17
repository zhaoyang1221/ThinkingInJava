package exercise_3;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/16 0016
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
    private int next = 0;
    public void add(Object x) {
        items.add(x);
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.size(); }
        public Object current() { return items.get(i); }
        public void next() { i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        sequence.add(11);
        sequence.add(12);
        sequence.add(13);
        sequence.add("hello");
        sequence.add("world");
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
