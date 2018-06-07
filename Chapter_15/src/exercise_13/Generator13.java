package exercise_13;

import exercise_12.coffee.CoffeeGenerator;
import exercise_16.coffee.Coffee;
import exercise_7.Fibonacci;
import net.mindview.util.Generator;

import java.util.*;

import static net.mindview.util.Print.print;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/6 0006
 * Description:
 */
public class Generator13 {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> List<T> fill(List<T> list, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            list.add(gen.next());
        }
        return list;
    }
    public static <T> Queue<T> fill(ArrayDeque<T> queue, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            queue.add(gen.next());
        }
        return queue;
    }
    public static <T> Set<T> fill(Set<T> set, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            set.add(gen.next());
        }
        return set;
    }
    public static <T> LinkedList<T> fill(LinkedList<T> ll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) ll.add(gen.next());
        return ll;
    }
}