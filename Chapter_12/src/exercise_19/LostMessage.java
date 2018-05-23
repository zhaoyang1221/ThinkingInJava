package exercise_19;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/23 0023
 * Description:
 */
//: exceptions/LostMessage.java
// How an exception can be lost.

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

class MeaninglessException extends Exception {
    public String toString() {
        return "A meaningless exception";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    void eliminate() throws MeaninglessException {
        throw new MeaninglessException();
    }
    public static void main(String[] args) {
        try {
            LostMessage lmf = new LostMessage();
            try {
                lmf.f();
            } catch(Exception e) {
                System.out.println(e);
            } finally {
                lmf.dispose();
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }
} /* Output:
A trivial exception
*///:~
