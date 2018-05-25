package exercise_7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/25 0025
 * Description:
 */
public class Ex7 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("README.md"));
        LinkedList<String> linkedList = new LinkedList<>();
        String s;

        while ((s = in.readLine()) != null) {
            linkedList.add(s);
        }
        while (linkedList.peekLast() != null) {
            System.out.println(linkedList.pollLast());
        }
    }

}