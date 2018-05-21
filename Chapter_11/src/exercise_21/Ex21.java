package exercise_21;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/21 0021
 * Description:
 */
//: holding/UniqueWords.java
import java.util.*;
import net.mindview.util.*;

public class Ex21 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(
                new TextFile("ThinkingInJava.iml", "\\W+"));
        System.out.println(words);

        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);

        Map<String, Integer> wordsMap = new LinkedHashMap<>();
        int totalWords = words.size();
        for (String s : words) {
            Integer count  = wordsMap.get(s);
            wordsMap.put(s, count == null ? 1 : count + 1);
        }
        System.out.println("total worlds: " + totalWords);
        System.out.println("words map: " + wordsMap);

    }
} /* Output:
[A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L, M, N, Output, Print, Set, SetOperations, String, X, Y, Z, add, addAll, added, args, class, contains, containsAll, false, from, holding, import, in, java, main, mindview, net, new, print, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void]
*///:~
