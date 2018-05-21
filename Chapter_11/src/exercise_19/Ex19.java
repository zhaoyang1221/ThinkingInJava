package exercise_19;

import exercise_1.Gerbil;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/21 0021
 * Description:
 */
public class Ex19 {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbilMap = new HashMap<>();
        gerbilMap.put("Fuzzy", new Gerbil(0));
        gerbilMap.put("Spot", new Gerbil(1));
        gerbilMap.put("Speedy", new Gerbil(2));
        gerbilMap.put("Dopey", new Gerbil(3));
        gerbilMap.put("Sleepy", new Gerbil(4));

        System.out.println(gerbilMap);
        TreeSet<String> sortedKey = new TreeSet<>(gerbilMap.keySet());
        System.out.println(sortedKey);
        Map<String, Gerbil> sortedGerbils = new LinkedHashMap<>();
        for (String s : sortedKey) {
            sortedGerbils.put(s, gerbilMap.get(s));
        }

        System.out.println();
        System.out.println();
        System.out.println(sortedGerbils);
        System.out.println();

        Set<String> linkedHashKeys = new LinkedHashSet<>(gerbilMap.keySet());
        System.out.println(linkedHashKeys);

        System.out.println();
        Map<String, Gerbil> linkedHashedGerbils = new LinkedHashMap<>();
        for (String s : linkedHashKeys) {
            System.out.print("s : ");
            linkedHashedGerbils.put(s, gerbilMap.get(s));
        }

        System.out.println();
        System.out.println();
        System.out.println("From LinkedHashSet: "
                + linkedHashedGerbils);
    }
}