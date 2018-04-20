package exercise_24;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/19 0019
 * To change this template use File | Settings | File Templates.
 * Description:
 */
import static net.mindview.util.Print.*;
public class Scarab extends Beetle {
    private int s = printInit("Scarab.k initialized");
    public Scarab() {
        print("s = " + s );
        print("j = " + j);


    }
    private static int x2 =
            printInit("static Scarab.x2 initialized");

    public static void main(String[] args) {
        print("Scarab constructor");
        Scarab s = new Scarab();
    }
}