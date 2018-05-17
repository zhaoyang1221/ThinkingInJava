package exercise_5;


import exercise_3.Outer3;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/7 0007
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Ex5 {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3("world");
        Outer3.Inner3 inner3 = outer3.new Inner3();
    }
}