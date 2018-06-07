package exercise_4;//: innerclasses/Sequence.java
// Holds a sequence of Objects.

import java.util.ArrayList;
import java.util.List;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence<T> {
    private List<T> list = new ArrayList<>();
    private int next = 0;

    public Sequence(List list) {
        this.list = list;
    }

    public void add(T t) {
        list.add(t);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == list.size();
        }

        public T current() {
            return list.get(i);
        }

        public void next() {
            if (i < list.size()) {
                i ++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Sequence sequence = new Sequence(list);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
