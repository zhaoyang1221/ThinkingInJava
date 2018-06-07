package exercise_15;


import typeinfo.pets.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/4 0004
 * Description:
 */
public class PetFactory {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Pet>> petFactories = new ArrayList<>();

    static {
        petFactories.add(new PetFilter.Factory());
		petFactories.add(new CatFilter.Factory());
		petFactories.add(new CymricFilter());
//		petFactories.add(new Dog.Factory());
//		petFactories.add(new EgyptianMau.Factory());
//		petFactories.add(new Hamster.Factory());
//		petFactories.add(new Manx.Factory());
//		petFactories.add(new Mouse.Factory());
//		petFactories.add(new Mutt.Factory());
//		petFactories.add(new Pug.Factory());
//		petFactories.add(new Rat.Factory());
//		petFactories.add(new Rodent.Factory());
    }
    private static Random rand = new Random();

    public static Pet createRandom() {
        int n = rand.nextInt(petFactories.size());
        return petFactories.get(n).create();
    }
}