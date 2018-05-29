package exercise_9;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/29 0029
 * Description:
 */
class A {
    String s;
    int i;
}

class B extends A {
}

class C extends B {
}

public class Ex9 {
    public static void main(String[] args) {
        searchSuper(new A());

    }

    public static void searchSuper(Object c) {
        Object[] fields = c.getClass().getDeclaredFields();
        if (fields.length == 0) {
            System.out.println("no fields");
        } else {
            for (Object o : fields) {
                System.out.println(" " + o);
            }
        }
    }

}