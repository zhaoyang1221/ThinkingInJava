package exercise_21;//: generics/ClassTypeCapture.java

import net.mindview.util.Print;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class Building {
}

class House extends Building {
}

public class ClassTypeCapture21<T> {
    Class<T> kind;
    Map<String, Class<?>> map;

    public ClassTypeCapture21(Class<T> kind, Map<String, Class<?>> map) {
        this.kind = kind;
        this.map = map;
    }

    public ClassTypeCapture21(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public void addType(String typename, Class<?> kind) {
        map.put(typename, kind);
    }
    public Object createNew(String typename) throws IllegalAccessException, InstantiationException {
        if (map.containsKey(typename)) {
            return map.get(typename).newInstance();
        } else {
            System.out.println(typename + "不存在！");
            return null;
        }

    }


    public static void main(String[] args) {
//        ClassTypeCapture21<Building> ctt1 =
//                new ClassTypeCapture21<Building>(Building.class);
//        System.out.println(ctt1.f(new Building()));
//        System.out.println(ctt1.f(new House()));
//        ClassTypeCapture21<House> ctt2 =
//                new ClassTypeCapture21<House>(House.class);
//        System.out.println(ctt2.f(new Building()));
//        System.out.println(ctt2.f(new House()));
        Map<String, Class<?>> map = new HashMap<>();
        ClassTypeCapture21<Building> ctt1 = new ClassTypeCapture21<>(Building.class, map);
        ctt1.addType("Building", Building.class);
        ctt1.addType("House", House.class);
        System.out.println("map" + map);

        try {
            Building b = (Building)ctt1.createNew("Building");
            House h = (House)ctt1.createNew("House");
            System.out.println(b.getClass().getName());
            System.out.println(h.getClass().getName());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
} /* Output:
true
true
false
true
*///:~
