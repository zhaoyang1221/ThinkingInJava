package exercise_22;

import java.lang.reflect.InvocationTargetException;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/7 0007
 * Description:
 */
class B {
    private static int count = 0;
    private final int id = count++;
    private String description;

    public B(String description) {
        this.description = description;
    }

    public B() {
        description = null;
    }

    @Override
    public String toString() {
        return "B{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}

public class Ex22<T> {
    Class<T> kind;

    public Ex22(Class<T> kind) {
        this.kind = kind;
    }

    public Object createNewClass(String typename) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return Class.forName(typename).newInstance();
    }

    public Object createNewClass(String typename, Object arg) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return Class.forName(typename).getConstructor(arg.getClass()).newInstance(arg);
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Ex22<B> ex22 = new Ex22<>(B.class);
        B b = (B)ex22.createNewClass("exercise_22.B", "hello");
        System.out.println(b);
    }
}