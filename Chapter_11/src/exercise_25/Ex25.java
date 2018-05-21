package exercise_25;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/21 0021
 * Description:
 */

import java.util.*;
import net.mindview.util.*;

public class Ex25 {
    public static Map getMap(){
        Map<String,ArrayList<Integer>> m = new LinkedHashMap<>();
        List<String> words = new LinkedList<>();
        words.addAll(new TextFile("SetOperations.java", "\\W+"));
        System.out.println("Words in file: " + words);
        Iterator itWords = words.iterator();
        int count = 0;
        while(itWords.hasNext()) {
            String s = (String)itWords.next();
            count++;
            if(!m.keySet().contains(s)) {
                ArrayList<Integer> ai =
                        new ArrayList<>();
                ai.add(0, count);
                m.put(s, ai);
            }
            else {
                m.get(s).add(count);
                m.put(s, m.get(s));
            }
        }
        System.out.println("Map of word locations: " + m);
        return m;
    }
    public static void main(String[] args) {
        getMap();
    }
}