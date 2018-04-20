package exercise_6_7_8;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/20 0020
 * To change this template use File | Settings | File Templates.
 * Description:
 */
import java.util.Random;

import static net.mindview.util.Print.*;

class Instrument {
    void play(Note n) { print("Instrument.play() " + n); }

    public String toString() {
        return "Instrument";
    }

    void adjust() { print("Adjusting Instrument"); }
}

class Wind extends Instrument {
    void play(Note n) { print("Wind.play() " + n); }

    @Override
    public String toString() { return "Wind"; }
    void adjust() { print("Adjusting Wind"); }
}

class Percussion extends Instrument {
    void play(Note n) { print("Percussion.play() " + n); }

    @Override
    public String toString() {
        return "Percussion";
    }

    void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    void play(Note n) { print("Stringed.play() " + n); }

    @Override
    public String toString() {
        return "Stringed";
    }

    void adjust() { print("Adjusting Stringed"); }
}

class Brass extends Wind {
    void play(Note n) { print("Brass.play() " + n); }

    @Override
    public String toString() {
        return "Brass";
    }

    void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
    void play(Note n) { print("Woodwind.play() " + n); }

    @Override
    public String toString() {
        return "Woodwind";
    }

}

class Piano extends Instrument {
    void play(Note n) { print("Piano.play() " + n); }

    @Override
    public String toString() {
        return "Piano";
    }

}

class RandomInstrument {
    private Random random = new Random();
    public Instrument next() {
        switch (random.nextInt(7)) {
            default:
            case 0: return new Instrument();
            case 1: return new Wind();
            case 2: return new Percussion();
            case 3: return new Stringed();
            case 4: return new Woodwind();
            case 5: return new Brass();
            case 6: return new Piano();
        }
    }
}
public class Music3 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    private static RandomInstrument gen = new RandomInstrument();
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Piano()
        };


//        tuneAll(orchestra);
//        for (Instrument i : orchestra){
//            System.out.println(i);
//        }

        Instrument[] instruments = new Instrument[9];
        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = gen.next();
        }
        tuneAll(instruments);
        for (Instrument i : instruments){
            System.out.println(i);
        }
    }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
