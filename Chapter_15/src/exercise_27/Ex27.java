package exercise_27;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/7 0007
 * Description:
 */
public class Ex27 {
    public static void main(String[] args) {
        // compile error: incompatible types:
        // List<Number> lnum = new ArrayList<Integer>();
        List<? extends Integer> nlist = new ArrayList<>();
        // compile error: can't add Integer:
//         nlist.add(new Integer(1));
//         nlist.add(new Object());
        nlist.add(null); // can add null
        Number x = nlist.get(0); // can get Number (null)
        System.out.println(nlist);
    }
}