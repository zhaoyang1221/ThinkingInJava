package exercise_8;

/**
 * @author zhaoyang on 2018/4/15 0015.
 */
class ThisClass {
    void foo (){
        System.out.println("hello world");
    }
    void foo2() {
        foo();
        this.foo();
    }
}
public class ThisTest {
    public static void main(String[] args) {
        ThisClass thisClass = new ThisClass();
        thisClass.foo2();
    }

}
