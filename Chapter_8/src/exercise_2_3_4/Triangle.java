package exercise_2_3_4;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/20 0020
 * To change this template use File | Settings | File Templates.
 * Description:
 */
import static net.mindview.util.Print.*;

public class Triangle extends Shape {
    @Override
    public void draw() { print("Triangle.draw()"); }
    @Override
    public void erase() { print("Triangle.erase()"); }

    @Override
    public void printShape() {
        print("Triangle.printShape()");
    }
} ///:~