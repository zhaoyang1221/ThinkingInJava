package exercise_20;


import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import static net.mindview.util.Print.print;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/4 0004
 * Description:
 */

public class Ex20 {
    public static void main(String[] args) {
        if (args.length < 1) {
            print("Class名");
            System.exit(0);
        }
        Class<?> c = null;
        try {
            c = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        print("c: " + c);
        print("c.getAnnotations(): ");
        if(c.getAnnotations().length == 0) print("none");
        for(Annotation a : c.getAnnotations())
            print(a);
        print("c.getCanonicalName(): " + c.getCanonicalName());
        print("c.getClasses(): ");
        if(c.getClasses().length == 0) print("none");
        for(Class cl : c.getClasses())
            print(cl);
        print("c.getClassLoader(): " + c.getClassLoader());
        print("c.getConstructors(): ");
        if(c.getConstructors().length == 0) print("none");
        for(Constructor ctor : c.getConstructors())
            print(ctor);
        print("c.getDeclaredAnnotations(): ");
        if(c.getDeclaredAnnotations().length == 0) print("none");
        for(Annotation a : c.getDeclaredAnnotations())
            print(a);
        print("c.getDeclaredClasses(): ");
        if(c.getDeclaredClasses().length == 0) print("none");
        for(Class cl : c.getDeclaredClasses())
            print(cl);
        print("c.getDeclaredConstructors(): ");
        if(c.getDeclaredConstructors().length == 0) print("none");
        for(Constructor ctor : c.getDeclaredConstructors())
            print(ctor);
        print("c.getDeclaredFields(): ");
        if(c.getDeclaredFields().length == 0) print("none");
        for(Field f : c.getDeclaredFields())
            print(f);
        print("c.getDeclaredMethods(): ");
        if(c.getDeclaredMethods().length == 0) print("none");
        for(Method m : c.getDeclaredMethods())
            print(m);
        print("c.getDeclaringClass(): " + c.getDeclaringClass());
        print("c.getEnclosingConstructor(): " + c.getEnclosingConstructor());
        print("c.getEnclosingMethod(): " + c.getEnclosingMethod());
        print("c.getEnumConstants(): " + c.getEnumConstants());
        print("c.getDeclaredFields(): ");
        if(c.getFields().length == 0) print("none");
        for(Field f : c.getFields())
            print(f);
        print("c.getGenericInterfaces(): ");
        if(c.getGenericInterfaces().length == 0) print("none");
        for(Type t : c.getGenericInterfaces())
            print(t);
        print("c.getGenericSuperclass(): " + c.getGenericSuperclass());
        print("c.getInterfaces(): ");
        if(c.getInterfaces().length == 0) print("none");
        for(Class i : c.getInterfaces())
            print(i);
        print("c.getMethods(): ");
        if(c.getMethods().length == 0) print("none");
        for(Method m : c.getMethods())
            print(m);
        print("c.getModifiers(): " + c.getModifiers());
        print("c.getName(): " + c.getName());
        print("c.getPackage(): " + c.getPackage());
        print("c.getProtectionDomain(): " + c.getProtectionDomain());
        print("c.getSigners(): ");
        if(c.getSigners() == null)
            print(c.getSigners());
        if(c.getSigners() != null) {
            print();
            if(c.getSigners().length == 0) print("none");
            if(c.getSigners().length > 0) {
                for(Object s : c.getSigners())
                    print(s);
            }
        }
        print("c.getSimpleName(): " + c.getSimpleName());
        print("c.getSuperclass(): " + c.getSuperclass());
        print("c.getTypeParameters(): " + c.getTypeParameters());
        print("c.isAnnotation(): " + c.isAnnotation());
        print("c.isAnnotationPresent(Documented.class): " + c.isAnnotationPresent(Documented.class));
        print("c.isAnonymousClass(): " + c.isAnonymousClass());
        print("c.isArray(): " + c.isArray());
        print("c.isAssignableFrom(Ex20.class): " + c.isAssignableFrom(Ex20.class));
        print("c.isAssignableFrom(Object.class): " + c.isAssignableFrom(Object.class));
        print("c.isEnum(): " + c.isEnum());
        print("c.isInstance(Object.class): " + c.isInstance(Object.class));
        print("c.isInterface(): " + c.isInterface());
        print("c.isLocalClass(): " + c.isLocalClass());
        print("c.isMemberClass(): " + c.isMemberClass());
        print("c.isPrimitive(): " + c.isPrimitive());
        print("c.isSynthetic(): " + c.isSynthetic());
    }
}