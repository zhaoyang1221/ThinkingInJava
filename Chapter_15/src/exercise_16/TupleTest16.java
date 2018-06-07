package exercise_16;

import net.mindview.util.*;
import typeinfo.pets.*;

import javax.swing.text.rtf.RTFEditorKit;

import static net.mindview.util.Tuple.tuple;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/6 0006
 * Description:
 */
class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {
    public final F sixth;

    public SixTuple(A a, B b, C c, D d, E e, F sixth) {
        super(a, b, c, d, e);
        this.sixth = sixth;
    }
    public String toString() {
        return "(" + this.first + ", " + this.second + ", " + this.third + ", " + this.fourth + ", " + this.fifth + ", " + this.sixth + ")";
    }
}

class Tuple1 extends Tuple {
    public Tuple1() {
    }

    public static <A, B, C, D, E, F> SixTuple<A, B, C, D, E, F> tuple(A a, B b, C c, D d, E e, F f) {
        return new SixTuple<>(a, b, c, d, e, f);
    }
}
public class TupleTest16 {
    static TwoTuple<String,Integer> f() {
        return tuple("hi", 47);
    }
    static TwoTuple f2() { return tuple("hi", 47); }
    static ThreeTuple<Pet,String,Integer> g() {
        return tuple(new Pet(), "hi", 47);
    }
    static FourTuple<Manx,Hamster,String,Integer> h() {
        return tuple(new Manx(), new Hamster(), "hi", 47);
    }
    static FiveTuple<Dog, Cymric,String,Integer,Double> k() {
        return tuple(new Dog(), new Cymric(), "hi", 47,
                11.1);
    }

    static SixTuple<Cat,EgyptianMau, Individual, String, Integer, Double> l() {
        return Tuple1.tuple(new Cat(),new EgyptianMau(), new Individual(), "hi", 47, 11.1);
    }
    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        // compiler warning: unchecked conversion:
        TwoTuple<String,Integer> ttsi2 = f2();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(l());
    }
}