package exercise_12;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/18 0018
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class Component1{
    Component1() {
        System.out.println("Component1");
    }
    void dispose() {
        System.out.println("Component1 dispose()");
    }
}

class Component2{
    Component2() {
        System.out.println("Component2");
    }
    void dispose() {
        System.out.println("Component2 dispose()");
    }
}

class Component3{
    Component3() {
        System.out.println("Component3");
    }

    void dispose() {
        System.out.println("Component3 dispose()");
    }
}

public class Root {
    Component1 component1;
    Component2 component2;
    Component3 component3;

    Root() {
        component1 = new Component1();
        component2 = new Component2();
        component3 = new Component3();
        System.out.println("Root()");
    }

    void dispose() {
        component1.dispose();
        component2.dispose();
        component3.dispose();
        System.out.println("Root dispose()");
    }
}