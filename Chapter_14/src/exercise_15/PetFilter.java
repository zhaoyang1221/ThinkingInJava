package exercise_15;

import exercise_13.Factory;
import typeinfo.pets.Pet;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/4 0004
 * Description:
 */
public class PetFilter extends Pet {

    public static class Factory implements exercise_15.Factory<Pet> {

        @Override
        public Pet create() {
            return new Pet();
        }
    }
}