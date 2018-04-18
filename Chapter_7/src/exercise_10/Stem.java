package exercise_10;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/18 0018
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Stem extends Root {
    Component1 component1 = new Component1(1);
    Component2 component2 = new Component2(2);
    Component3 component3 = new Component3(3);

    Stem(int i) {
        super(i);
        System.out.println("stem()_" + i);
    }

    public static void main(String[] args) {
        Stem stem = new Stem(3);
    }
}