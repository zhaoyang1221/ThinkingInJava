package exercise_14;

import net.mindview.util.BasicGenerator;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/6 0006
 * Description:
 */
public class BasicGeneratorDemo14 {
    public static void main(String[] args) {
        BasicGenerator<CountedObject> gen = new BasicGenerator<>(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}