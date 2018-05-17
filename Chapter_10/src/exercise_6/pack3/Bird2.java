package exercise_6.pack3;

import exercise_6.pack1.Fly;
import exercise_6.pack2.Bird;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/7 0007
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Bird2 extends Bird {
    public Fly Fly() {
        return this.new LittleBird();
    }

    public static void main(String[] args) {
        Bird2 bird2 = new Bird2();
        bird2.Fly().fly();
    }
}