package exercise_15;

class MyString {
    String s;
    {
        s = "hello world";
        System.out.println("s initialized");
        System.out.println(s);
    }
    MyString(String s) {
        this.s = s;
    }
}
public class Main {
    public static void main(String[] args) {
        new MyString("hello world");
    }
}
