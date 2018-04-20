package exercise_15;

import exercise_14.Car;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/19 0019
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MyCar extends Car {
    public static void main(String[] args) {
        MyCar myCar = new MyCar();
        myCar.protectedMethod();
    }
}