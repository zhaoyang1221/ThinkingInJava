package exercise_13;

import net.mindview.util.TypeCounter;

import java.util.ArrayList;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/4 0004
 * Description:
 */
public class Ex13 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Part.class);
        ArrayList<Part> partList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            partList.add(Part.createRandom());
        }
        for (Part part: partList) {
            printnb(part.getClass().getSimpleName() + " ");
            counter.count(part);
        }
        print();
        print(counter);
    }
}