package exercise_27;

import java.io.*;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/28 0028
 * Description:
 */
class A implements Serializable {
    private int i;

    public A(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "A: " + i;
    }
}

class B implements Serializable {
    private  char c;
    private A a;

    public B(char c, A a) {
        this.c = c;
        this.a = a;
    }

    @Override
    public String toString() {
        return "B:" + c + " " + a;
    }
}
public class Ex27 {
    private static Random random = new Random();
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        B b = new B('b', new A(random.nextInt(10)));
        System.out.println("b: " + b);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Data.txt"));
        out.writeObject(b);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Data.txt"));
        B bout = (B)in.readObject();
        System.out.println("bout" + bout);

    }
}