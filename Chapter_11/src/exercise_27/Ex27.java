package exercise_27;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/22 0022
 * Description:
 */

class Command {
    String s = "Command";

    public Command(String s) {
        this.s = s;
    }

    void operation() {
        System.out.println(s);
    }
}

class CommandQueue {
    Queue<Command> makeQueue() {
        Queue<Command> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.offer(new Command(i + " "));
        }
        return queue;
    }

}
public class Ex27 {
    public static void commandEater(Queue<Command> qc) {
        while (qc.peek() != null) {
            qc.poll().operation();
        }
    }
    public static void main(String[] args) {
        CommandQueue m = new CommandQueue();
        commandEater(m.makeQueue());
    }
}