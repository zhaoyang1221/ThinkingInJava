package exercise_12;

import java.time.zone.ZoneOffsetTransitionRule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/18 0018
 * Description:
 */
public class Ex12 {
    public static void main(String[] args) {
        Integer[] ints = new Integer[5];
        for (int i= 0; i < ints.length; i++) {
            ints[i] = i;
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(ints));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5,6,7,8,9));
        ListIterator<Integer> listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            Integer i = listIterator.previous();
            list2.add(i);
        }
        System.out.println(list2);

    }
}