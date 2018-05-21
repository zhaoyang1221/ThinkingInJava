package exercise_13;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/21 0021
 * Description:
 */
//: innerclasses/controller/Event.java
// The common methods for any control event.
public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }
    public void start() { // Allows restarting
        eventTime = System.nanoTime() + delayTime;
    }
    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
} ///:~
