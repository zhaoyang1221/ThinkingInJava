package exercise_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/25 0025
 * Description:
 */
public class Ex10 {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        String word = args[1];

        BufferedReader in = new BufferedReader(new FileReader(fileName));
        LinkedList<String> linkedList = new LinkedList<>();
        String s;

        while ((s = in.readLine()) != null) {
            List<String> line = Arrays.asList(s.split("\\W+"));
            if (line.contains(word)) {
                linkedList.add(s);
            }
        }
        while (linkedList.peekLast() != null) {
            System.out.println(linkedList.pollLast());
        }
        in.close();
    }
}