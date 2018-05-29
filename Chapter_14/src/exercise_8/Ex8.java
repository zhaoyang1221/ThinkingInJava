package exercise_8;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/29 0029
 * Description:
 */
class A {}

class B extends A {}

class C extends B {}

public class Ex8 {
    public static void main(String[] args) {
        searchSuper(new C());

    }
    public static void searchSuper(Object c) {
        if (c.getClass().getSuperclass() != null) {
            System.out.println(c.getClass() + " is a subclass of " + c.getClass().getSuperclass());
            try {
                searchSuper(c.getClass().getSuperclass().newInstance());
            } catch (IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

}