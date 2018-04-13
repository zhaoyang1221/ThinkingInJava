package exercise_3;

class Letter {
    float f;
}

public class PassObject {
    static void f(Letter y) {
        y.f = 12344f;
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.f = 1.45f;
        System.out.println("1: x.f: " + x.f);
        f(x);
        System.out.println("2: x.f: " + x.f);
    }
}
