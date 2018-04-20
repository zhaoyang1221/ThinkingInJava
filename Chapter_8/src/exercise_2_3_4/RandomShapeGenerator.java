package exercise_2_3_4;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/20 0020
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class RandomShapeGenerator {
    private Random rand = new Random();
    public Shape next() {
        switch(rand.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Rectangle();
        }
    }
} ///:~
