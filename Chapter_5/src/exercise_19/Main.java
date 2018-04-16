package exercise_19;

public class Main {
    static void foo(String... ss) {
        for (String s : ss) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        foo("hello", "world","you");
//        foo(new String[]{"hello", "world","you"});
    }
}
