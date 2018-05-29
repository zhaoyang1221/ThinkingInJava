package exercise_20;

import net.mindview.util.BinaryFile;
import net.mindview.util.Directory;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/28 0028
 * Description:
 */
public class Ex20 {
    public static void main(String[] args) throws IOException {
        List<File> files = Directory.walk(".", ".*(.class)").files;
        for (File file: files) {
            byte[] bytes = BinaryFile.read(file);
            for (int i = 0; i < 4; i++) {
                System.out.print(Integer.toHexString(bytes[i] & 0xff).toUpperCase());
            }
            System.out.println();
        }
//        System.out.println(Integer.toBinaryString(0xff));
    }
}