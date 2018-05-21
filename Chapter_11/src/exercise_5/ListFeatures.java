package exercise_5;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/18 0018
 * Description:
 */
//: holding/ListFeatures.java
import java.util.*;
import static net.mindview.util.Print.*;

public class ListFeatures {
    public static List<Integer> listOfRandInteger(int length, int n) {
        Random rand = new Random();
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i < length; i++)
            li.add(rand.nextInt(n));
        return li;
    }
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> li = listOfRandInteger(7,10);
        print("1: " + li);
        Integer h = new Integer(rand.nextInt(10));
        li.add(h); // Automatically resizes
        print("2: " + li);
        print("3: " + li.contains(h));
        li.remove(h); // Remove by object
        print("3.5: " + li);
        Integer p = li.get(2);
        print("4: " +  p + " " + li.indexOf(p));
        Integer cymric = new Integer(rand.nextInt(10));
        print("5: " + li.indexOf(cymric));
        print("6: " + li.remove(cymric));
        // Must be the exact object:
        print("7: " + li.remove(p));
        print("8: " + li);
        li.add(3, new Integer(rand.nextInt(10))); // Insert at an index
        print("9: " + li);
        List<Integer> sub = li.subList(1, 4);
        print("subList: " + sub);
        print("10: " + li.containsAll(sub));
        Collections.sort(sub); // In-place sort
        print("sorted subList: " + sub);
        // Order is not important in containsAll():
        print("11: " + li.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        print("shuffled subList: " + sub);
        print("12: " + li.containsAll(sub));
        List<Integer> copy = new ArrayList<Integer>(li);
        sub = Arrays.asList(li.get(1), li.get(4));
        print("sub: " + sub);
        copy.retainAll(sub);
        print("13: " + copy);
        copy = new ArrayList<Integer>(li); // Get a fresh copy
        copy.remove(2); // Remove by index
        print("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        print("15: " + copy);
        if (copy.size() > 2) {
            copy.set(1, rand.nextInt(10)); // Replace an element
        }
        print("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        print("17: " + copy);
        print("18: " + li.isEmpty());
        li.clear(); // Remove all elements
        print("19: " + li);
        print("20: " + li.isEmpty());
        li.addAll(listOfRandInteger(4,10));
        print("21: " + li);
        Object[] o = li.toArray();
        print("22: " + o[3]);
        Integer[] pa = li.toArray(new Integer[0]);
        print("23: " + pa[3]);
    }
} /* Output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]
3: true
4: Cymric 2
5: -1
6: false
7: true
8: [Rat, Manx, Mutt, Pug, Cymric, Pug]
9: [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug]
subList: [Manx, Mutt, Mouse]
10: true
sorted subList: [Manx, Mouse, Mutt]
11: true
shuffled subList: [Mouse, Manx, Mutt]
12: true
sub: [Mouse, Pug]
13: [Mouse, Pug]
14: [Rat, Mouse, Mutt, Pug, Cymric, Pug]
15: [Rat, Mutt, Cymric, Pug]
16: [Rat, Mouse, Cymric, Pug]
17: [Rat, Mouse, Mouse, Pug, Cymric, Pug]
18: false
19: []
20: true
21: [Manx, Cymric, Rat, EgyptianMau]
22: EgyptianMau
23: 14
*///:~
