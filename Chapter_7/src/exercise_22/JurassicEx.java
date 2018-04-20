package exercise_22;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/19 0019
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class SmallBrain {}

final class Dinosaur {
    SmallBrain x = new SmallBrain();
}

// class Further extends Dinosaur {} // error: cannot inherit from final Dinosaur

public class JurassicEx {
    public static void main(String[] args) {
        Dinosaur d = new Dinosaur();
    }
}