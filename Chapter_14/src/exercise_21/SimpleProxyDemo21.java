package exercise_21;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/4 0004
 * Description:
 */
//: typeinfo/SimpleProxyDemo.java
import static net.mindview.util.Print.*;

interface Interface {
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface {
    public void doSomething() {
        print("doSomething");
    }
    public void somethingElse(String arg) {
        print("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;
    private static int doCount = 0;
    private static int seCount = 0;
    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    public void doSomething() {
        print("SimpleProxy doSomething");
        print("调用dosomething()次数：" + ++doCount);
        proxied.doSomething();
    }
    public void somethingElse(String arg) {
        print("SimpleProxy somethingElse " + arg);
        print("调用somethingElse()次数：" + ++seCount);
        proxied.somethingElse(arg);
    }
}

class SimpleProxyDemo21 {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        print();
        consumer(new SimpleProxy(new RealObject()));
        print();
        consumer(new SimpleProxy(new RealObject()));
        print();
        consumer(new SimpleProxy(new RealObject()));
    }
} /* Output:
doSomething
somethingElse bonobo
SimpleProxy doSomething
doSomething
SimpleProxy somethingElse bonobo
somethingElse bonobo
*///:~
