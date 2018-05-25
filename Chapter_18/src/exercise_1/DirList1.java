package exercise_1;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/24 0024
 * Description:
 */
//: io/DirList.java
// Display a directory listing using regular expressions.
// {Args: "D.*\.java"}
import net.mindview.util.TextFile;

import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList1 {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if(args.length < 2) {
            list = path.list();
            System.out.println("enter regex:");
        }
        else {
            list = path.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(args[0]);
                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches() &&
                            !Collections.disjoint(
                                    Arrays.asList(args).subList(1, args.length),
                                    new TextFile(name, "\\W+"));
                }
            });
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list)
            System.out.println(dirItem);
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
