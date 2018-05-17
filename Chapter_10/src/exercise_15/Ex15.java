package exercise_15;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/14 0014
 * Description:
 */
class A {
    private String s;
    A (String s) {
        this.s = s;
    }
    public void print() {
        System.out.println(s);
    }
}
public class Ex15 {
    public A makeA(String s){
        return new A(s) {};
    }

    public static void main(String[] args) {
        Ex15 ex15 = new Ex15();
        ex15.makeA("world").print();
    }
}