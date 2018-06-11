package exercise_28;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/11 0011
 * Description:
 */
import typeinfo.pets.Cat;
import typeinfo.pets.Pet;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/8 0008
 * Description:
 */
class Generic<T> {
    T t;
    void f(T t) {
        System.out.println(t);
    }
}

class Generic2<T> {
    T t;

    T g() {
        return t;
    }
}

public class Ex28 {
    <T> void contra(Generic<? super T> glt, T t) {
        glt.f(t);
    }

    <T> T cn(Generic2<? extends T> glt) {
        return glt.g();
    }

    public static void main(String[] args) {
        Ex28 ex28 = new Ex28();
        ex28.contra(new Generic<Pet>(), new Cat("Kitty"));
        ex28.cn(new Generic2<Pet>());
    }
}