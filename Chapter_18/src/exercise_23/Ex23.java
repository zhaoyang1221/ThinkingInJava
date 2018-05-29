package exercise_23;

import java.nio.CharBuffer;

import static net.mindview.util.Print.*;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/28 0028
 * Description:
 */
public class Ex23 {
    public static boolean isChar(char c) {
        return ((c >= '!') && (c <= '~'));
    }
    public static void printCharBuffer(CharBuffer cb) {
        cb.clear();
        while(cb.hasRemaining()) {
            char c = cb.get();
            if(isChar(c)) System.out.print(c);
        }
    }
    public static void main(String[] args) {
        char[] ca = {'w','x','y','z'};
        CharBuffer cb = CharBuffer.wrap(ca);
        print("CharBuffer by wrapping char[]: ");
        printCharBuffer(cb);
        System.out.println();
        CharBuffer cb2 = CharBuffer.allocate(6);

        char[] ca2 = {'s','t','u','v','w'};
        cb2.put(ca2);
        print("CharBuffer by allocation: ");
        printCharBuffer(cb2);
        System.out.println();
        // Try some unprintable chars:
        char[] ca3 = {(char)0x01, (char)0x07, (char)0x7F,'b','y','e'};
        CharBuffer cb3 = CharBuffer.wrap(ca3);
        print("CharBuffer including some unprintables: ");
        printCharBuffer(cb3);
    }
}