package exercise_6;
class Dog {
    void bark() {
        System.out.println("quiet");
    }
    void bark(int x, char c) {
        System.out.println("linlinlin");
    }
    void bark(char c, int x) {
        System.out.println("barking");
    }
    void bark(double d) {
        System.out.println("howling");
    }
}
public class DogTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1,'a');
        dog.bark('c', 1);
    }
}

