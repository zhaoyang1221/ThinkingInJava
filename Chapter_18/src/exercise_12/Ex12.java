package exercise_12;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/25 0025
 * Description:
 */
public class Ex12 {
    static String file = "FileOutPutShortcut.out";
    public static void main(String[] args) throws IOException {
        String fileName = "README.md";
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        String s;
        int lineCount = 1;
        while ((s = in.readLine()) != null) {
            out.println(lineCount + ": " + s);
            lineCount++;
        }
        out.close();
    }
}