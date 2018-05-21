package exercise_23;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/21 0021
 * Description:
 */
//: holding/Statistics.java
// Simple demonstration of HashMap.
import java.util.*;

public class Ex23 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer,Integer> m =
                new HashMap<Integer,Integer>();
        for(int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);

        Integer max = -1;
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry);
    }
} /* Output:
{15=497, 4=481, 19=464, 8=468, 11=531, 16=533, 18=478, 3=508, 7=471, 12=521, 17=509, 2=489, 13=506, 9=549, 6=519, 1=502, 14=477, 10=513, 5=503, 0=481}
*///:~
