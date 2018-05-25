package exercise_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/25 0025
 * Description:
 */
public class Ex9 {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        LinkedList<String> linkedList = new LinkedList<>();
        String s;

        while ((s = in.readLine()) != null) {
            linkedList.add(s.toUpperCase());
        }
        while (linkedList.peekLast() != null) {
            System.out.println(linkedList.pollLast());
        }
        in.close();
    }
}