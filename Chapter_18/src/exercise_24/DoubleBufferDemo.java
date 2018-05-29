package exercise_24;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.IntBuffer;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/28 0028
 * Description:
 */
public class DoubleBufferDemo {

        private static final int BSIZE = 1024;
        public static void main(String[] args) {
            ByteBuffer bb = ByteBuffer.allocate(BSIZE);
            DoubleBuffer ib = bb.asDoubleBuffer();
            // Store an array of int:
            ib.put(new double[]{ 11.2, 42.3, 47.5, 99.7, 143.8, 811.6, 1016 });
            // Absolute location read and write:
            System.out.println(ib.get(3));
            ib.put(3, 1811);
            // Setting a new limit before rewinding the buffer.
            ib.flip();
            while(ib.hasRemaining()) {
                double i = ib.get();
                System.out.println(i);
            }
        }
} /* Output:
99
11
42
47
1811
143
811
1016
*///:~