package exercise_25;

import exercise_24.A;
import exercise_24.AMaker24;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/5 0005
 * Description:
 */
public class Ex25 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        A a = AMaker24.makeSecret();
        System.out.println("a: " + a.getClass().getName());
        for (Method m : a.getClass().getDeclaredMethods()) {
            m.setAccessible(true);
            m.invoke(a);
        }
    }
}