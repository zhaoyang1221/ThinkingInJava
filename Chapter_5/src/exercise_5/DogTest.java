package exercise_5;

class Dog {
    void bark() {
        System.out.println("quiet");
    }
    void bark(int x) {
        System.out.println("linlinlin");
    }
    void bark(char c) {
        System.out.println("barking");
    }
    void bark(double d) {
        System.out.println("howling");
    }
}
public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1);
        dog.bark('c');
        dog.bark(233.33);
    }
}
