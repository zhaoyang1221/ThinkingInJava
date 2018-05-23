package exercise_32;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/22 0022
 * Description:
 */
//: holding/NonCollectionSequence.java

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

import static net.mindview.util.Print.print;
import static sun.misc.Version.println;

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence implements Iterable<Pet> {
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            public boolean hasNext() {
                return index < pets.length;
            }
            public Pet next() { return pets[index++]; }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    int current = pets.length - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[current--];
                    }
                };
            }
        };
    }
    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            public Iterator<Pet> iterator() {
                List<Pet> shuffled = new
                        ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }
    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        print("pets: ");
        for(Pet p : nc.pets)
            print(p + " ");
        println();
        print("reversed: ");
        for(Pet p : nc.reversed())
            print(p + " ");
        println();
        print("randomized: ");
        for(Pet p : nc.randomized())
            print(p + " ");
    }
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
