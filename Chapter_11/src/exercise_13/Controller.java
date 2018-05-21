package exercise_13;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/21 0021
 * Description:
 */
//: innerclasses/controller/Controller.java
// The reusable framework for control systems.
import java.util.*;

public class Controller {
    // A class from java.util to hold Event objects:
    private LinkedList<Event> eventList = new LinkedList<>();
    public void addEvent(Event c) { eventList.add(c); }
    public void run() {
        ListIterator<Event> it = eventList.listIterator();
        while (it.hasNext()) {
            it.next().action();
            it.previous();
            System.out.println(it.next());
        }
    }
} ///:~
