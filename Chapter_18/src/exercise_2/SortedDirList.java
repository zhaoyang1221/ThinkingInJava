package exercise_2;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/25 0025
 * Description:
 */
public class SortedDirList {
    private String[] dirList;
    public SortedDirList(File filePath) {
        dirList = filePath.list();
        Arrays.sort(dirList, String.CASE_INSENSITIVE_ORDER);
    }

    public String[] list() {
        return dirList;
    }
    public String[] list(String regex) {
        Pattern pattern = Pattern.compile(regex);
        ArrayList<String> arrayList = new ArrayList<>();
        int count = 0;
        for (String s: dirList) {
            if (pattern.matcher(s).matches()) {
                arrayList.add(s);
                count++;
            }
        }
        return arrayList.toArray(new String[count]);
    }

    public static void main(String[] args) {
        SortedDirList dirList = new SortedDirList(new File("."));
        System.out.println(dirList);
        for(String s : dirList.list())
            System.out.println(s);
        System.out.println();
        for(String s : dirList.list(".+\\.md"))
            System.out.println(s);
    }
}