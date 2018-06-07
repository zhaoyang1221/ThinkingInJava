package exercise_16;

import exercise_16.coffee.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/4 0004
 * Description:
 */
public class CoffeeFactory {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Factory<? extends Coffee>> coffeeFactories = new ArrayList<>();

    static {
        coffeeFactories.add(new Latte.Factory());
        coffeeFactories.add(new Mocha.Factory());
        coffeeFactories.add(new Cappuccino.Factory());
        coffeeFactories.add(new Americano.Factory());
        coffeeFactories.add(new Breve.Factory());
    }

    private static Random rand = new Random();

    public static Coffee createRandom() {
        int n = rand.nextInt(coffeeFactories.size());
        return coffeeFactories.get(n).create();
    }

}