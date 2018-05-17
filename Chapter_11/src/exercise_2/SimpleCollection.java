package exercise_2;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/16 0016
 * Description:
 */
//: holding/SimpleCollection.java
import java.util.*;

public class SimpleCollection {
    public static void main(String[] args) {
//        Collection<Integer> c = new ArrayList<Integer>();
//        for(int i = 0; i < 10; i++)
//            c.add(i); // Autoboxing
//        for(Integer i : c)
//            System.out.print(i + ", ");
        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer i : c){
            System.out.print(i + ", ");
        }
    }
} /* Output:
0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
*///:~
