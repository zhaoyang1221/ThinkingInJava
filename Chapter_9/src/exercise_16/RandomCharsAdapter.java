package exercise_16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/2 0002
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class RandomCharsAdapter extends RandomChars implements Readable {
    private int count;

    public RandomCharsAdapter(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0) return -1;
        String result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomCharsAdapter(10));
        while(s.hasNext())
            System.out.println(s.next() + " ");
    }
}