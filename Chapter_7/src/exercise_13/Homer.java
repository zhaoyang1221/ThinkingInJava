package exercise_13;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/19 0019
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class BaseClass {
    char doh (char c) {
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }
    int doh(int i) {
        System.out.println("doh(int)");
        return 2;
    }
}
public class Homer extends BaseClass {
    String doh(String s) {
        System.out.println("doh(String)");
        return "helloWorld";
    }

    public static void main(String[] args) {
        Homer homer = new Homer();
        homer.doh('c');
        homer.doh("helloWord");
        homer.doh(3);
        homer.doh(1.0f);

    }
}