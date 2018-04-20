package exercise_17;


/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/19 0019
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Frog extends Amphibian {
    @Override
    void walk() {
        System.out.println("frog walk()");
    }

    @Override
    void swim() {
        System.out.println("frog swim()");
    }

    @Override
    void grow(Amphibian a) {
        System.out.println("frog grow()");
    }

    public static void main(String[] args) {
        Frog frog =  new Frog();
        frog.walk();
        frog.swim();
        frog.grow(frog);
    }
}