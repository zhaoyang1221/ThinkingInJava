package exercise_12;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/2 0002
 * To change this template use File | Settings | File Templates.
 * Description:
 */
//: interfaces/Adventure.java
// Multiple interfaces.

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface canClimb {
    void climb();
}

class ActionCharacter {
    public void fight() {}
}

class Hero extends ActionCharacter
        implements CanFight, CanSwim, CanFly , canClimb{
    public void swim() {}
    public void fly() {}
    public void climb(){}
}

public class Adventure {
    public static void t(CanFight x) { x.fight(); }
    public static void u(CanSwim x) { x.swim(); }
    public static void v(CanFly x) { x.fly(); }
    public static void w(ActionCharacter x) { x.fight(); }
    public static void y(canClimb x) { x.climb(); }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
        y(h);
        w(h); // Treat it as an ActionCharacter
    }
} ///:~
