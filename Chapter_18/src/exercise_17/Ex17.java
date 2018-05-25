package exercise_17;

import java.util.*;

import static net.mindview.util.TextFile.*;
import static net.mindview.util.Print.print;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/25 0025
 * Description:
 */
public class Ex17 {
    public static void main(String[] args) {
        // File whose Characters are to be counted:
        String fileName = "README.md";
        // Array of all char in file:
        char[] ca = read(fileName).toCharArray();
        // Set of unique Characters in file:
        Set<Character> charSet = new TreeSet<>();
        for(char c : ca) charSet.add(c); // Autoboxing
        // List of all Characters in file:
        List<Character> charList = new ArrayList<Character>();
        for(char c : ca) charList.add(c);
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();
        for(Character c : charSet) {
            int count = 0;
            for(Character d : charList) {
                if(d.equals(c)) count++;
            }
            charMap.put(c, count);
        }
        print();
        print(charMap);
    }
}