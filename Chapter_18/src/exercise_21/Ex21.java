package exercise_21;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/28 0028
 * Description:
 */
public class Ex21 {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedInputStream stdin = new BufferedInputStream(new FileInputStream(new File("README.md")));
        String s;
        System.setIn(stdin);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while ((s = bufferedReader.readLine()) != null && s.length() != 0) {
            System.out.println(s.toUpperCase());
        }
    }
}