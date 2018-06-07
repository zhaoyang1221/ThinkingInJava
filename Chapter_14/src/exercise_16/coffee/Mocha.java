//: generics/coffee/Mocha.java
package exercise_16.coffee;

import exercise_16.Factory;

public class Mocha extends Coffee {
    public static class Factory implements exercise_16.Factory<Mocha> {
        @Override
        public Mocha create() {
            return new Mocha();
        }
    }
} ///:~
