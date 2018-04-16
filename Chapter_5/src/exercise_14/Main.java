package exercise_14;

class StaticClass {
    static String s = "String";
    static String s2;
    static {
        s2 = "static field String";
        System.out.println("s 和 s2 初始化了");
    }
    static void printClass() {
        System.out.println(s + "; " + s2);
    }
}
public class Main {
    public static void main(String[] args){
        StaticClass.printClass();
    }
    static StaticClass sc = new StaticClass();
}
