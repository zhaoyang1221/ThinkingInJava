package exercise_3;


/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/7 0007
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Outer3 {
    private String s;

    public Outer3(String s) {
        this.s = s;
    }

    public class Inner3 {
        public Inner3 () {
            System.out.println("Inner class");
        }
        public String toString() {
            return s;
        }
    }

    public Inner3 createInner3 () {
        return  new Inner3();
    }

    public static void main(String[] args) {
        Outer3 outer3 = new Outer3("outer3");
        Inner3 inner3 = outer3.createInner3();
        System.out.println(inner3.toString());
    }
}