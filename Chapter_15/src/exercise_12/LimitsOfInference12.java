package exercise_12;

import net.mindview.util.New;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/6 0006
 * Description:
 */
public class LimitsOfInference12 {
    static void f(Map<Person, List<? extends Pet>> petPeople) {

    }

    public static void main(String[] args) {

        f(New.<Person, List<? extends Pet>>map());
    }
}