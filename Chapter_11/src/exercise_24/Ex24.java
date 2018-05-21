package exercise_24;

import exercise_1.Gerbil;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/21 0021
 * Description:
 */
public class Ex24 {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbilMap = new LinkedHashMap<>();
        gerbilMap.put("Fuzzy", new Gerbil(0));
        gerbilMap.put("Spot", new Gerbil(1));
        gerbilMap.put("Speedy", new Gerbil(2));
        gerbilMap.put("Dopey", new Gerbil(3));
        gerbilMap.put("Sleepy", new Gerbil(4));

        Map<String, Gerbil> tempMap = new LinkedHashMap<>();
        Set<String> keySet = new TreeSet<>(gerbilMap.keySet());
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Gerbil g = gerbilMap.get(key);
            tempMap.put(key, g);
        }
        System.out.println(gerbilMap);
        System.out.println(tempMap);

        gerbilMap.clear();
        gerbilMap = tempMap;
        System.out.println(gerbilMap);

    }
}