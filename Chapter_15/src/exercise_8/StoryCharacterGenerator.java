package exercise_8;

import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/5 0005
 * Description:
 */
class StoryCharacter {
    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class GoodGuy extends StoryCharacter {}
class BadGuy extends StoryCharacter {}

class LukeSkywalker extends GoodGuy {}
class Yoda extends GoodGuy {}
class DarthVader extends BadGuy {}
class JabbaTheHut extends BadGuy {}

public class StoryCharacterGenerator implements Generator<StoryCharacter>,  Iterable<StoryCharacter> {
    private Class[] types = { DarthVader.class, JabbaTheHut.class,
            LukeSkywalker.class, Yoda.class };
    private static Random rand = new Random();
    public StoryCharacterGenerator() {}
    // For iteration:
    private int size = 0;
    public StoryCharacterGenerator(int sz) { size = sz; }
    public StoryCharacter next() {
        try {
            return
                    (StoryCharacter)types[rand.nextInt(types.length)].newInstance();
            // Report programmer errors at run time:
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
    class StoryCharacterIterator implements Iterator<StoryCharacter> {
        int count = size;
        public boolean hasNext() { return count > 0; }
        public StoryCharacter next() {
            count--;
            return StoryCharacterGenerator.this.next();
        }
        public void remove() { // Not implemented
            throw new UnsupportedOperationException();
        }
    }
    public Iterator<StoryCharacter> iterator() {
        return new StoryCharacterIterator();
    }
    public static void main(String[] args) {
        StoryCharacterGenerator gen = new StoryCharacterGenerator();
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());
        for(StoryCharacter s : new StoryCharacterGenerator(5))
            System.out.println(s);
    }
}