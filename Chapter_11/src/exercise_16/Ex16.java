package exercise_16;

import net.mindview.util.TextFile;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/21 0021
 * Description:
 */
public class Ex16 {
    static void vowelCounter(Set<String> st) {
        Set<Character> vowels = new TreeSet<>();
        Collections.addAll(vowels, 'A','E','I','O','U','a','e','i','o','u');
        int allVowels = 0;
        for (String s : st) {
            int count = 0;
            for (Character c : s.toCharArray()) {
                if (vowels.contains(c)) {
                    count++;
                    allVowels++;
                }
            }
            System.out.println(s + ": " + count + ", ");
        }
        System.out.println();
        System.out.print("Total vowels: " + allVowels);
    }

    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("SetOperations.java", "\\W+"));
        System.out.println(words);
        System.out.println();
        vowelCounter(words);
    }
}