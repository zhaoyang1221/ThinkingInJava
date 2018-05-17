package exercise_10;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/11 0011
 * Description:
 */

interface A {
    String printA();
}
public class Ex10 {
    private void internalTracking(boolean b) {
        if (b) {

            class PA implements A {
                private String s;

                public PA(String s) {
                    this.s = s;
                }

                @Override
                public String printA() {
                    return s;
                }
            }

            PA pa = new PA("hahaha");
            String s = pa.printA();
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Ex10 ex10 = new Ex10();
        ex10.internalTracking(true);
    }
}