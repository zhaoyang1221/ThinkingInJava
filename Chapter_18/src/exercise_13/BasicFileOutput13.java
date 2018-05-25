package exercise_13;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/25 0025
 * Description:
 */
public class BasicFileOutput13 {
    static String file = "FileOutPutShortcut.out";
    public static void main(String[] args) throws IOException {
        LineNumberReader in = new LineNumberReader(
                new FileReader("README.md"));
        PrintWriter out = new PrintWriter(file);
        String s;
        while((s = in.readLine()) != null )
            out.println(in.getLineNumber() + ": " + s);
        out.close();
    }
}