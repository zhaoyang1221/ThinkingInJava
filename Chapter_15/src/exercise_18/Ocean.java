package exercise_18;

import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/6 0006
 * Description:
 */
class BigFish {
    private static long counter = 1;
    private final long id = counter++;

    private BigFish() {
    }

    @Override
    public String toString() {
        return "BigFish{" +
                "id=" + id +
                '}';
    }

    public static Generator<BigFish> generator() {
        return new Generator<BigFish>() {
            @Override
            public BigFish next() {
                return new BigFish();
            }
        };
    }
}

class LittleFish {
    private static long counter = 1;
    private final long id = counter++;

    private LittleFish() {
    }

    @Override
    public String toString() {
        return "LittleFish{" +
                "id=" + id +
                '}';
    }

    public static Generator<LittleFish> generator() {
        return new Generator<LittleFish>() {
            @Override
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }
}
public class Ocean {
    static void eat(BigFish bigFish, LittleFish littleFish) {
        System.out.println(bigFish + " eat " + littleFish);
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<BigFish> hunters = new ArrayList<>();
        Generators.fill(hunters, BigFish.generator(), 3);
        LinkedList<LittleFish> food = new LinkedList<>();
        Generators.fill(food, LittleFish.generator(), 15);

        for (LittleFish lf: food) {
            eat(hunters.get(random.nextInt(hunters.size())), lf);
        }
    }
}