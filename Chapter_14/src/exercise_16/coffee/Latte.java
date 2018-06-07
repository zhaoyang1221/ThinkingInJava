//: generics/coffee/Latte.java
package exercise_16.coffee;

import exercise_16.Factory;

public class Latte extends Coffee {
    public static class Factory implements exercise_16.Factory<Latte> {
        @Override
        public Latte create() {
            return new Latte();
        }
    }
} ///:~
