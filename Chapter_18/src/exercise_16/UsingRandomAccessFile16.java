package exercise_16;

import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/25 0025
 * Description:
 */
public class UsingRandomAccessFile16 {
    static String file = "Data.txt";
    static void display() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "r");
            System.out.println("rf.readInt() = " + rf.readInt());
            System.out.println("rf.read() = " + rf.read());
            System.out.println("rf.readBoolean() = " + rf.readBoolean());
            System.out.println("rf.readByte() = " + rf.readByte());
            System.out.println("rf.read() = " + rf.read()); // ASCII h = 104
            System.out.println("rf.read() = " + rf.read()); // ASCII i = 105
            System.out.println("rf.readChar() = " + rf.readChar());
            System.out.println("rf.readChar() = " + rf.readChar());
            System.out.println("rf.readChar() = " + rf.readChar());
            System.out.println("rf.readDouble() = " + rf.readDouble());
            System.out.println("rf.readFloat() = " + rf.readFloat());
            System.out.println("rf.readInt() = " + rf.readInt());
            System.out.println("rf.readLong() = " + rf.readLong());
            System.out.println("rf.readShort() = " + rf.readShort());
            System.out.println("rf.readUTF() = " + rf.readUTF());

        System.out.println(rf.readUTF());
        rf.close();
    }
    public static void main(String[] args)
            throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "rw");
        for(int i = 0; i < 7; i++)
            rf.writeDouble(i*1.414);
        rf.writeUTF("The end of the file");
        rf.close();
        display();
        rf = new RandomAccessFile(file, "rw");
        rf.seek(5*8);
        rf.writeDouble(47.0001);
        rf.close();
        display();
    }
}