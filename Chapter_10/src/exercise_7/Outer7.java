package exercise_7;

import exercise_3.Outer3;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/7 0007
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Outer7 {
    private int i = 0;
    private void printInt(){
        System.out.println(i);
    }

    class Inner7{
        public void changeOuterInt(int x) {
            i = x;
            printInt();
        }
    }

    public void callInner() {
        Inner7 inner7 = new Inner7();
        inner7.changeOuterInt(10);
    }

    public static void main(String[] args) {
        Outer7 outer7 = new Outer7();
        outer7.printInt();
        outer7.callInner();

    }
}