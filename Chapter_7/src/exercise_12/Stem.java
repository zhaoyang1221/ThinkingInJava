package exercise_12;


/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/18 0018
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Stem extends Root {
    Component1 component1 ;
    Component2 component2 ;
    Component3 component3 ;

    Stem() {
//        super();
        component1 = new Component1();
        component2 = new Component2();
        component3 = new Component3();
        System.out.println("stem()");
    }
    void dispose() {
        component1.dispose();
        component2.dispose();
        component3.dispose();
        super.dispose();
        System.out.println("Stem dispose()");
    }

    public static void main(String[] args) {
        Stem stem = new Stem();
        try {

        } finally {
          stem.dispose();
        }
    }
}