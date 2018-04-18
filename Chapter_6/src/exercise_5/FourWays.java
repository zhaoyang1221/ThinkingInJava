package exercise_5;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/16 0016
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class FourWays {
    public String s = "hello world";
    private char c = 'a';
    protected int a = 2;
    int i = 0;
    FourWays() {
        System.out.println("Constructor");
    }
    public void printS() {
        System.out.println(s);
    }
    private void printC() {
        System.out.println(c);
    }

    protected void printA() {
        System.out.println(a);
    }
    void printI() {
        System.out.println(i);
    }

}
