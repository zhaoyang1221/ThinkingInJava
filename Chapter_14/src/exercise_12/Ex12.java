package exercise_12;

import exercise_12.coffee.Coffee;
import exercise_12.coffee.CoffeeGenerator;
import net.mindview.util.TypeCounter;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/4 0004
 * Description:
 */
public class Ex12 {
    public static void main(String[] args) {
        TypeCounter typeCounter = new TypeCounter(Coffee.class);
        for (Coffee coffee: new CoffeeGenerator(20)) {
            printnb(coffee.getClass().getSimpleName() + " ");
            typeCounter.count(coffee);
        }
        print();
        print(typeCounter);
    }
}