//: generics/coffee/Cappuccino.java
package exercise_16.coffee;

import exercise_16.Factory;

public class Cappuccino extends Coffee {
    public static class Factory implements exercise_16.Factory<Cappuccino> {
        @Override
        public Cappuccino create() {
            return new Cappuccino();
        }
    }
} ///:~
