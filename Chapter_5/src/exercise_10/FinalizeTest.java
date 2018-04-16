package exercise_10;

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
public class FinalizeTest {
    public static void main(String[] args) {
        Book book = new Book(true);
        book.checkIn();

        new Book(true);
        System.gc();

    }
}
