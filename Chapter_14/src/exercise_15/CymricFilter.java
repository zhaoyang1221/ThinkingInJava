package exercise_15;

import typeinfo.pets.Cymric;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/4 0004
 * Description:
 */
public class CymricFilter extends Cymric implements Factory<Cymric> {
    @Override
    public Cymric create() {
        return new Cymric();
    }
}