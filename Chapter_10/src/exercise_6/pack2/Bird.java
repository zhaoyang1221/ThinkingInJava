package exercise_6.pack2;

import exercise_6.pack1.Fly;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/7 0007
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Bird {
    private String name = "bird";
    protected class LittleBird implements Fly {
        public LittleBird() {
        }

        @Override
        public void fly() {
            System.out.println("little bird is flying");
        }
    }

}