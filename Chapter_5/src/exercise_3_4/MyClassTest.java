package exercise_3_4;

class MyClass {
    String s = "it's MyClass";

    MyClass() {
        System.out.println(s);
    }

    MyClass(String s2) {
        System.out.println(s);
        System.out.println(s2);
    }

}
public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MyClass myClass1 = new MyClass("hello");

    }
}
