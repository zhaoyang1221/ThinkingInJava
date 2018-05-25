package exercise_30;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/24 0024
 * Description:
 */
//: exceptions/TurnOffChecking.java
// "Turning off" Checked exceptions.
import java.io.*;
import static net.mindview.util.Print.*;

class WrapCheckedException {
    void throwRuntimeException(int type) {
        try {
            switch(type) {
                case 0: throw new Annoyance();
                case 1: throw new Sneeze();
                case 2: throw new RuntimeException("Where am I?");
                default: return;
            }
        } catch(Exception e) { // Adapt to unchecked:
            throw new RuntimeException(e);
        }
    }
}

public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckedException wce = new WrapCheckedException();
        // You can call throwRuntimeException() without a try
        // block, and let RuntimeExceptions leave the method:
        wce.throwRuntimeException(3);
        // Or you can choose to catch exceptions:
        for(int i = 0; i < 4; i++)
            try {
                if(i < 3)
                    wce.throwRuntimeException(i);
                else
                    throw new RuntimeException();
            } catch(RuntimeException re) {
                try {
                    throw re.getCause();
                } catch(Sneeze e) {
                    print("Sneeze: " + e);
                } catch(Annoyance e) {
                    print("Annoyance: " + e);
                } catch(Throwable e) {
                    print("Throwable: " + e);
                }
            }
    }
}
