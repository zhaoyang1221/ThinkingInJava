package exercise_15;

import typeinfo.pets.Cat;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/4 0004
 * Description:
 */
public class CatFilter extends Cat {
    public static class Factory implements exercise_15.Factory<Cat> {
        @Override
        public Cat create() {
            return new Cat();
        }
    }
}