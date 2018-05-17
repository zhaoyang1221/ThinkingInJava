package exercise_12;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/14 0014
 * Description:
 */

interface Inner12 {
    void changeOuterInt(int x);
}

public class Outer12 {
    private int i  = 0;
    public void printInt(){
        System.out.println(i);
    }

    public Inner12 inner12() {
        return new Inner12() {
            public void changeOuterInt(int x) {
                i = x;
                printInt();
            }

        };
    }

    public static void main(String[] args) {
        Outer12 outer12 = new Outer12();
        outer12.printInt();
        outer12.inner12().changeOuterInt(45);
        outer12.printInt();
    }
}