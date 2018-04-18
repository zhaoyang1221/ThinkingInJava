package exercise_9;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/16 0016
 * To change this template use File | Settings | File Templates.
 * Description:
 */

/**
 * //access/local/PackagedClass.java
 * package access.local;
 *
 * class PackagedClass {
 *	public PackagedClass() {
 *		System.out.println("Creating a packaged class");
 *	}
 * }
 */

// access/foreign/Foreign.java
//package access.foreign;
//import access.local.*;

public class Foreign {
    public static void main(String[] args) {
//        PackagedClass pc = new PackagedClass();
    }
}

/*编译错误是因为packageClass没有public关键字，导致Foreign类在包外没法访问到。
* 会正常编译
*/
