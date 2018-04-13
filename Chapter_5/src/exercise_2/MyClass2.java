package exercise_2;

/**
 * 类定义和构造器的定义中的域 主要是顺序不一样
 */
class MyString {
    String s;
    String s2 = "aug";
    String s3;

    MyString() {
        this.s3 = "akm";
    }
}
public class MyClass2 {
    public static void main(String[] args) {
        MyString myString = new MyString();
        System.out.println("s: " + myString.s);
        System.out.println("s2: " + myString.s2);
        System.out.println("s3: " + myString.s3);

    }
}
