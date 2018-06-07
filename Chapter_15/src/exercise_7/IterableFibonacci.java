package exercise_7;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/5 0005
 * Description:
 */
public class IterableFibonacci implements Iterable<Integer>{
    private Fibonacci fibonacci; //组合代替继承
    private int n;
    public IterableFibonacci(int n) {
        this.n = n;
        this.fibonacci = new Fibonacci();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return fibonacci.next();
            }
        };
    }

    public static void main(String[] args) {
        for (int i: new IterableFibonacci(18)) {
            System.out.print(i + " ");
        }
    }
}