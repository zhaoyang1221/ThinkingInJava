package exercise_23;

import exercise_22.FailingConstructor;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/24 0024
 * Description:
 */
class DisposeClass {
    private boolean disposed;
    private static int counter = 0;
    private int id = counter++;

    public DisposeClass() {
        disposed = false;
    }
    void dispose() {
        disposed = true;
    }
    String checkStatus(){
        return (id + ": disposed:" + disposed);
    }
}
public class FailingConstructor23 {
    private Integer[] ia = new Integer[2];
    private static DisposeClass d0;
    private static DisposeClass d1;

    public FailingConstructor23() throws Exception {
        try {
            d0 = new DisposeClass();
            try {
                ia[2] = 2; //throw exception
                try {
                    d1 = new DisposeClass();
                } catch (Exception e) {
                    System.out.println("Caught e in inner try loop");
                    e.printStackTrace();

                }
            } catch (Exception e) {
                System.out.println("Caught e in middle try loop");
                e.printStackTrace();
                System.out.println("Disposing d0");
                d0.dispose();
            }
        }catch(Exception e) {
            System.out.println(("Caught e in outer try loop"));
            e.printStackTrace(System.err);
            System.out.println(("Failed to create d0"));
        }
    }

    public static void main(String[] args) {
        try {
            FailingConstructor23 fc = new FailingConstructor23();

        }catch (Exception e) {
            System.out.println("Caught Exception in main()");
            e.printStackTrace(System.err);
        }
    }
}