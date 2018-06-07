//: generics/coffee/Americano.java
package exercise_16.coffee;

public class Americano extends Coffee {
    public static class Factory implements exercise_16.Factory<Americano> {
        @Override
        public Americano create() {
            return new Americano();
        }
    }
} ///:~
