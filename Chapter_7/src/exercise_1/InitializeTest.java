package exercise_1;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/18 0018
 * To change this template use File | Settings | File Templates.
 * Description:
 */

class InnerClass {
    private String s;
    InnerClass() {
        System.out.println("InnnerClass");
        s = "Constructed";
    }
    public String toString() {
        return s;
    }
}
public class InitializeTest {
    private String s1,s2,s3;
    private InnerClass innerClass;
    InitializeTest(){
        System.out.println("Inside initializeTest()");
        this.s1 = "hello";
        this.s2 = "world";
        this.innerClass = new InnerClass();
    }

    public String toString() {
        if (s3 == null) {
            s3 = "all of you";
        }
        return  "s1 =" + s1 + "\n" +
                "s2 =" + s2 + "\n" +
                "s3 =" + s3 + "\n" +
                "innerClass =" +  innerClass.toString();
    }

    public static void main(String[] args) {
        InitializeTest initializeTest = new InitializeTest();
        System.out.println(initializeTest.toString());
    }


}