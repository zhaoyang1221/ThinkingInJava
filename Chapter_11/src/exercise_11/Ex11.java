package exercise_11;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/18 0018
 * Description:
 */
public class Ex11 {
    //collection 子类是list和set map是与collection同级的
    public static void printObject(Collection c) {
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        ArrayList<Integer> al =
                new ArrayList<>(Arrays.asList(1, 2, 3));
        LinkedList<Character> ll =
                new LinkedList<>(Arrays.asList('a', 'b', 'c'));
        HashSet<Float> hs =
                new HashSet<>(Arrays.asList(1.1f, 2.2f, 3.3f));
        TreeSet<Double> ts =
                new TreeSet<>(Arrays.asList(1.11, 2.22, 3.33));
        LinkedHashSet<Integer> lhs =
                new LinkedHashSet<>(Arrays.asList(11, 22, 33));

        printObject(al);
        printObject(ll);
        printObject(hs);
        printObject(ts);
        printObject(lhs);
    }
}