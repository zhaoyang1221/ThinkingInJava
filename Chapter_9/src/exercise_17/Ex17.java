package exercise_17;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/2 0002
 * To change this template use File | Settings | File Templates.
 * Description:
 */
interface Days {
    int SUNDAY = 1, MONDAY = 2, TUESDAY = 3, WEDNESDAY = 4,
            THURSDAY = 5, FRIDAY = 6, SATURDAY = 7;
}

class Week implements Days {
    private static int count = 0;
    private int id = count++;
    public Week() { System.out.println("Week() " + id); }
}

public class Ex17 {
    public static void main(String[] args) {
        // 证明是static ：直接通过类名来直接调用，而不需要实例化
        System.out.println("SUNDAY = " + Days.SUNDAY);
        System.out.println("MONDAY = " + Days.MONDAY);
        Week w0 = new Week();
        Week w1 = new Week();
        // 证明是final： final一旦初始化就无法更改，下面语句会报错
        // w.SUNDAY = 2;
        //
        // w1.MONDAY = w0.MONDAY;
    }
}