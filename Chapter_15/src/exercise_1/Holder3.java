package exercise_1;

import typeinfo.pets.Dog;
import typeinfo.pets.Manx;
import typeinfo.pets.Pet;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/5 0005
 * Description:
 */
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder3<Pet> h3 = new Holder3<>(new Pet());
        Pet a = h3.getA();

        h3.setA(new Dog());
        System.out.println(h3.getA());

        h3.setA(new Manx());
        System.out.println(h3.getA());
    }
}