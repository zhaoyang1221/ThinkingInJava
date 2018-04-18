package exercise_10;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/18 0018
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class Component1{
    Component1(int i) {
        System.out.println("Component1");
    }
}

class Component2{
    Component2(int i) {
        System.out.println("Component2");
    }
}

class Component3{
    Component3(int i) {
        System.out.println("Component3");
    }
}

public class Root {
    Component1 component1 = new Component1(1);
    Component2 component2 = new Component2(2);
    Component3 component3 = new Component3(3);

    Root(int i) {
        System.out.println("Root()_" + i);
    }
}