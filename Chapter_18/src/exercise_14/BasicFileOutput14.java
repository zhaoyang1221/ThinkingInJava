package exercise_14;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/25 0025
 * Description:
 */
public class BasicFileOutput14 {
    static String file = "BasicFileOutput14.out";
    static String file2 = "BasicFileOutput142.out";
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(
//                new StringReader(
//                        file.read("BasicFileOutput14.java")));
//        // Buffered writer:
//        PrintWriter out = new PrintWriter(
//                new BufferedWriter(new FileWriter(file)));
//        int lineCount = 1;
//        String s;
//        long start = System.nanoTime();
//        while((s = in.readLine()) != null )
//            out.println(lineCount++ + ": " + s);
//        long duration = System.nanoTime() - start;
//        out.close();
//        System.out.println("Buffered write:   " + duration + " nanoseconds");
//        BufferedReader in2 = new BufferedReader(
//                new StringReader(
//                        BufferedInputFile.read("BasicFileOutput14.java")));
//
//
//        // Unbuffered writer:
//        PrintWriter out2 = new PrintWriter(new FileWriter(file2));
//        int lineCount2 = 1;
//        String s2;
//        long start2 = System.nanoTime();
//        while((s2 = in2.readLine()) != null )
//            out2.println(lineCount2++ + ": " + s2);
//        long duration2 = System.nanoTime() - start2;
//        out2.close();
//        System.out.println("Unbuffered write: " + duration2 + " nanoseconds");
//        // Show the stored files:
//        System.out.println("file: " + BufferedInputFile.read(file));
//        System.out.println("file2: " + BufferedInputFile.read(file2));
//    }
}