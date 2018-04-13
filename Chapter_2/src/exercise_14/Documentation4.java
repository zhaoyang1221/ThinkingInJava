// object/Documentation4.java
package exercise_14;

import java.util.Date;

public class Documentation4 {

    /** Let's try a public field list
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol>
     */
    public int i;

    /**
     * A private field list (-private to see)
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol>
     */
    private int j;

    /**
     * @param args array list of parameters
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol><br>
     */
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("d = " + d);
    }
}
