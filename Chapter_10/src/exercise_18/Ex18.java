package exercise_18;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/14 0014
 * Description:
 */
public class Ex18 {
    Ex18() {
        System.out.println("Ex18()");
    }

    public static class Ex18Nest1 {
        public Ex18Nest1() {
            System.out.println("Ex18 nest1()");
        }
    }
    public static class Ex18Nest2{
        public Ex18Nest2() {
            System.out.println("Ex18 nest2()");
        }
    }

    public static void main(String[] args) {
        Ex18 ex18 = new Ex18();
        Ex18Nest1 ex18Nest1 = new Ex18Nest1();

    }
}