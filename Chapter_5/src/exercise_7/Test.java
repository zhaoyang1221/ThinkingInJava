package exercise_7;

class ConstructorTest {
    void bark () {
        System.out.println("quiet");
    }
}
public class Test {
    public static void main(String[] args) {
        ConstructorTest constructorTest = new ConstructorTest();
        constructorTest.bark();
    }
}
