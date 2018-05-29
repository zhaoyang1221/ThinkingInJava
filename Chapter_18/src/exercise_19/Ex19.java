package exercise_19;

import net.mindview.util.BinaryFile;
import static net.mindview.util.Print.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/28 0028
 * Description:
 */
public class Ex19 {
    public static void main(String[] args) throws IOException {
        Map<Byte, Integer> map = new HashMap<>();
        byte[] binaryBytes = BinaryFile.read("README.md");

        for (byte b : binaryBytes) {
            if (map.containsKey(b)) {
                Integer temp = map.get(b);
                map.put(b, ++temp);
            } else {
                map.put(b, 1);
            }
        }
        print(map);
    }
}