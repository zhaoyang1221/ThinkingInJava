package exercise_8;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/7 0007
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Outer8 {
    class Inner8 {
        private int i=0;
    }

    public int getInner() {
        Inner8 inner8 = new Inner8();
        return inner8.i;
    }

    public static void main(String[] args) {
        Outer8 outer8 = new Outer8();
        System.out.println(outer8.getInner());
    }

    //可以访问内部类的private元素，但需要创建内部类实例
}