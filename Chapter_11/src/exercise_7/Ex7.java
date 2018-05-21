package exercise_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/18 0018
 * Description:
 */
class T {
    public static int count = 0;
    private int id = count++;

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
public class Ex7 {
    public static void main(String[] args) {
        T[] ts = new T[10];
        for (int i = 0; i< ts.length; i++) {
            ts[i] = new T();
        }
        List<T> list = new ArrayList<>(Arrays.asList(ts));
        System.out.println("List: " + list);

        List<T> subList =  list.subList(0, 3);

        System.out.println("subList" + subList);
        list.removeAll(subList);
        System.out.println("after remove: " + list);
    }
}