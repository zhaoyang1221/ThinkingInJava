//: generics/coffee/Breve.java
package exercise_16.coffee;

import exercise_16.Factory;

public class Breve extends Coffee {
    public static class Factory implements exercise_16.Factory<Breve> {
        @Override
        public Breve create() {
            return new Breve();
        }
    }
} ///:~
