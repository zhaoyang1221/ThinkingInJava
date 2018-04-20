package exercise_11;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/19 0019
 * To change this template use File | Settings | File Templates.
 * Description:
 */

import static net.mindview.util.Print.*;

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        print(x);
    }
}

public class DetergentDelegation {
    private String s = "Detergent";
    private Cleanser cleanser = new Cleanser();

    public void append(String a) { s += a;}

    //Delegated methods;
    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        append("DetergentDelegation.scrub()");
        cleanser.scrub();
    }

    @Override
    public String toString() {
        return  s +" " + cleanser;
    }

    public static void main(String[] args) {
        DetergentDelegation detergentDelegation = new DetergentDelegation();
        detergentDelegation.dilute();
        detergentDelegation.apply();
        detergentDelegation.scrub();
        print(detergentDelegation);

        Cleanser.main(args );
    }
}