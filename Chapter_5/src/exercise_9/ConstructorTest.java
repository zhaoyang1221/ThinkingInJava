package exercise_9;

/**
 * @author zhaoyang on 2018/4/15 0015.
 */
class Flower {
    int petalCount = 0;
    String s = "";

    Flower(int petals) {
        petalCount = petals;
    }
    Flower(int petals, String s) {
        this(petals);
        this.s = s;
    }
}
public class ConstructorTest {
    public static void main(String[] args) {
        Flower flower = new Flower(3, "hello");
        System.out.println(flower.petalCount + " " + flower.s);
    }
}
