package exercise_11;

class Book {
    boolean checkout = false;
    Book(boolean checkout) {
        this.checkout = checkout;
    }
    void checkIn() {
        checkout = false;
    }
    protected void finalize() {
        if (checkout) {
            System.out.println("error: checked out");
        }
    }
}

public class FinalizeTest2 {
    public static void main(String[] args) {
        Book book1 = new Book(true);
        Book book2 = new Book(true);
        book1.checkIn();

        System.out.println("1:");
        System.runFinalization();
        System.out.println("2:");
        Runtime.getRuntime().runFinalization();
    }
}
