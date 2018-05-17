package exercise_26;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/14 0014
 * Description:
 */
class FirstOuter {
    public class Inner {
        public Inner(String s) {
            System.out.println("s");
        }
    }
}
public class Ex26 {
    class Inner2 extends FirstOuter.Inner {

        public Inner2(FirstOuter x) {
            x.super("hello");// 闭包引用
            System.out.println("SecondOuter.SecondInner()");
        }
    }

    public static void main(String[] args) {
        FirstOuter fo = new FirstOuter();
        Ex26 ex26 = new Ex26();
        Inner2 inner2 = ex26.new Inner2(fo);
    }
}