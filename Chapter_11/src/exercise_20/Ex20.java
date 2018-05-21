package exercise_20;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/21 0021
 * Description:
 */

import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/21 0021
 * Description:
 */
public class Ex20 {
    static void vowelCounter(Set<String> st) {
        Set<Character> vowels = new TreeSet<>();
        Collections.addAll(vowels, 'A','E','I','O','U','a','e','i','o','u');
        int allVowels = 0;
        Map<Character, Integer> map = new TreeMap<>();
        for (String s : st) {
            for (Character c : s.toCharArray()) {
                if (vowels.contains(c)) {
                    Integer count = map.get(c);
                    map.put(c, count == null ? 1 : count + 1);
                    allVowels++;
                }
            }
        }
        System.out.println("Vowels: " + map);
        System.out.print("Total vowels: " + allVowels);
    }

    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(
                new TextFile("ThinkingInJava.iml", "\\W+"));
        System.out.println(words);
        System.out.println();
        vowelCounter(words);
    }
}