package exercise_1;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/4 0004
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Outer {
    class Inner {
        private String s = "Inner";
        public void value() {
            System.out.println(s);
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.getInner();
        i.value();
    }
}