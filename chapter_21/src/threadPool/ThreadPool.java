package threadPool;

import com.sun.org.apache.bcel.internal.generic.RET;
import exercise_12.Atomicity;

import java.lang.annotation.Target;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/25/0025
 * Description:
 */
class MyTask implements Runnable {
    private int taskId;
    private String taskName;

    public MyTask(int taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        try {
            System.out.println("当前线程Id->" + taskId + ",任务名称->" + taskName);
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThreadFactory implements ThreadFactory {
    private final ThreadGroup threadGroup;
    private final AtomicInteger threadNumber = new AtomicInteger(0);
    private final String threadPrefix;

    public MyThreadFactory(String name) {
        SecurityManager securityManager = System.getSecurityManager();
        threadGroup = (securityManager != null) ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        threadPrefix = name + "-thread";

    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(threadGroup, r,
                threadPrefix + threadNumber.getAndIncrement(),
                0);
        if (t.isDaemon())
            t.setDaemon(false);
        if (t.getPriority() != Thread.NORM_PRIORITY)
            t.setPriority(Thread.NORM_PRIORITY);
        return t;
    }
}
public class ThreadPool {
    private static ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,2,
            0, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(3),
            new MyThreadFactory("MyThreadFactory"),
            new ThreadPoolExecutor.AbortPolicy());

    public static ThreadPoolExecutor getPoolExecutor() {
        return poolExecutor;
    }

    public static void main(String[] args) {
        ThreadPoolExecutor pool = ThreadPool.getPoolExecutor();

        MyTask task1 = new MyTask(1, "任务1");
        MyTask task2 = new MyTask(2, "任务2");
        MyTask task3 = new MyTask(3, "任务3");
        MyTask task4 = new MyTask(4, "任务4");
        MyTask task5 = new MyTask(5, "任务5");
        MyTask task6 = new MyTask(6, "任务6");

        pool.execute(task1);
        pool.execute(task2);
        pool.execute(task3);
        pool.execute(task4);
        pool.execute(task5);
        pool.execute(task6);
        pool.shutdown();
    }
}