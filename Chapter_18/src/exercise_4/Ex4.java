package exercise_4;

import net.mindview.util.Directory;

import java.io.File;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/25 0025
 * Description:
 */
public class Ex4 {
    public static void main(String[] args) {
        List<File> fileList = Directory.walk(".", ".*(.iml)").files;
        long sum = 0;
        for (File file: fileList) {
            System.out.print("file: " );
            System.out.println(file.length());
            sum += file.length();
        }

        System.out.println("Total file size: " + sum);
    }
}