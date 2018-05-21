package exercise_14;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/21 0021
 * Description:
 */
public class Ex14 {
    static void addMiddle(LinkedList<Integer> l, Integer[] ia) {

        for(Integer i : ia) {
            ListIterator<Integer> it =
                    l.listIterator((l.size())/2);
            it.add(i);
            System.out.println(l);
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Integer[] x = {0, 1, 2, 3, 4, 5, 6, 7};
        Ex14.addMiddle(linkedList, x);

    }
}