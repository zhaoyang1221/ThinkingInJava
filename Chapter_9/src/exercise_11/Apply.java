package exercise_11;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/28 0028
 * To change this template use File | Settings | File Templates.
 * Description:
 */
import static net.mindview.util.Print.*;

public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
} ///:~