package exercise_2;

import typeinfo.pets.Dog;
import typeinfo.pets.Manx;
import typeinfo.pets.Pet;

import javax.xml.ws.Holder;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/5 0005
 * Description:
 */
public class Holder2<T> {
    private T a;
    private T b;
    private T c;

    public Holder2(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {

        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public T getC() {
        return c;
    }

    public void setC(T c) {
        this.c = c;
    }

    public static void main(String[] args) {
        Holder2<Pet> holder2 = new Holder2<>(new Pet(), new Dog(), new Manx());
        System.out.println(holder2.getA());
        System.out.println(holder2.getB());
        System.out.println(holder2.getC());

    }
}