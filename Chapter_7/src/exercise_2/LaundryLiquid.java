package exercise_2;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/18 0018
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class LaundryLiquid extends Detergent{
    public void scrub() {
        append("LaundryLiquid.scrub()");
    }
    public void sterilize() {
        append("sterilize()");
    }

    public static void main(String[] args) {
        LaundryLiquid laundryLiquid = new LaundryLiquid();
        laundryLiquid.dilute();
        laundryLiquid.apply();
        laundryLiquid.scrub();
        laundryLiquid.foam();
        laundryLiquid.sterilize();
        System.out.println(laundryLiquid);
        System.out.println("Testing base class: ");
        Detergent.main(args);
    }
}