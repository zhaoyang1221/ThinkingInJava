package exercise_16;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/4 0004
 * Description:
 */
public class RegisteredFactories16 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            System.out.println(CoffeeFactory.createRandom());
    }
}