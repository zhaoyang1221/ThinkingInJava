package exercise_29;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/22 0022
 * Description:
 */

class A{

}
public class Ex29 {
    public static void main(String[] args) {
        PriorityQueue<A> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(new A());
        }
        //报错，需要继承Comparable或者实现Comparator
    }
}