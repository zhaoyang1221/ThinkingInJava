package exercise_3;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/25 0025
 * Description:
 */
//: io/DirList.java
// Display a directory listing using regular expressions.
// {Args: "D.*\.java"}

import net.mindview.util.TextFile;

import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList3 {
    public static void main(String[] args) {
        File path = new File(".");
        File[] files = path.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(".+(.iml)");

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        Arrays.sort(files);
        long sumSize = 0;
        for (File dirItem : files) {
            System.out.println(dirItem);
            sumSize += dirItem.length();
        }
        System.out.println("文件尺寸总和：" + sumSize);
    }
}

//class DirFilter implements FilenameFilter{
//    private Pattern pattern;
//    public DirFilter(String regex) {
//        pattern = Pattern.compile(regex);
//    }
//
//    @Override
//    public boolean accept(File dir, String name) {
//        return pattern.matcher(name).matches() && new TextFile();
//    }
//}
