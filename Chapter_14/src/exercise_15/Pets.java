package exercise_15;

import typeinfo.pets.Pet;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/4 0004
 * Description:
 */
public class Pets {
    public static final PetCreator creator = new PetCreator();

    public Pets() {
    }

    public static Pet randomPet() {
        return creator.randomPet();
    }

    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }

    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}