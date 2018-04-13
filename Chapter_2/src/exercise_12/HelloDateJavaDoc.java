//:exercise_12/HelloDateJavaDoc.java
package exercise_12;

import java.util.Date;

/**
 * Displays a string and today's date.
 * @author zh
 * @version 4.0
 */
public class HelloDateJavaDoc {
    /**
     * Entrv point to class and application
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
} /*Output
*///:~