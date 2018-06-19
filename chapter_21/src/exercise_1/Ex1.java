package exercise_1;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/19/0019
 * Description:
 */
class MyRunnable implements Runnable {
    public MyRunnable() {
        System.out.println("constructing myRunnable1");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("myRunnable1");
            Thread.yield();
        }
        System.out.println("myRunnable1 complete.");
    }

}
class MyRunnable2 implements Runnable {
    public MyRunnable2() {
        System.out.println("constructing myRunnable2");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("myRunnable2");
            Thread.yield();
        }
        System.out.println("myRunnable2 complete.");
    }

}
class MyRunnable3 implements Runnable {
    public MyRunnable3() {
        System.out.println("constructing myRunnable3");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("myRunnable3");
            Thread.yield();
        }
        System.out.println("myRunnable3 complete.");
    }

}
public class Ex1 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable2());
        Thread t3 = new Thread(new MyRunnable3());
        t1.start();
        t2.start();
        t3.start();
    }
}