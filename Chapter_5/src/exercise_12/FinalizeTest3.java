package exercise_12;

class Tank {
    boolean isFull = false;

    Tank(boolean isFull) {
        this.isFull = isFull;
    }

    void setEmpty() {
        this.isFull = false;
    }
    void printStatus() {
        if (isFull) {
            System.out.println("Tank is full");
        } else {
            System.out.println("Tank is empty");
        }
    }
    protected void finalize() {
        if (isFull) {
            System.out.println("error: is full");
        }
    }

}
public class FinalizeTest3 {
    public static void main(String[] args) {
        Tank tank1 = new Tank(true);
        Tank tank2 = new Tank(true);
//        new Tank(true);

        tank1.setEmpty();
        tank2.setEmpty();
        System.out.print("Tank1: ");
        tank1.printStatus();
        System.out.print("Tank2: ");
        tank2.printStatus();
        System.gc();
    }
}
