package exercise_24;//: generics/ClassTypeCapture.java

import java.util.HashMap;
import java.util.Map;

interface Factory<T> {
    T create();
}

class Building {
    public static class Factory implements exercise_24.Factory<Building> {
        @Override
        public Building create() {
            return new Building();
        }
    }
}


class House extends Building {

    public static class Factory implements exercise_24.Factory<House> {
        @Override
        public House create() {
            return new House();
        }
    }
}

public class ClassTypeCapture24<T> {
    Factory<?> factory;
    Map<String, Factory<?>> map;

    public ClassTypeCapture24(Factory<?> factory, Map<String, Factory<?>> map) {
        this.factory = factory;
        this.map = map;
    }

    public ClassTypeCapture24(Factory factory) {
        this.factory = factory;
    }

    public boolean f(Object arg) {
        return arg.getClass().isInstance(factory.create());
    }

    public void addType(String typename, Factory<?> factory) {
        map.put(typename, factory);
    }

    public Object createNew(String typename) throws IllegalAccessException, InstantiationException {
        if (map.containsKey(typename)) {
            return map.get(typename).create();
        } else {
            System.out.println(typename + "不存在！");
            return null;
        }

    }


    public static void main(String[] args) {
//        ClassTypeCapture24<Building> ctt1 =
//                new ClassTypeCapture24<Building>(Building.class);
//        System.out.println(ctt1.f(new Building()));
//        System.out.println(ctt1.f(new House()));
//        ClassTypeCapture24<House> ctt2 =
//                new ClassTypeCapture24<House>(House.class);
//        System.out.println(ctt2.f(new Building()));
//        System.out.println(ctt2.f(new House()));
        Map<String, Factory<?>> map = new HashMap<>();
        ClassTypeCapture24<Building> ctt1 = new ClassTypeCapture24<>(new Building.Factory(), map);
        ctt1.addType("Building", new Building.Factory());
        ctt1.addType("House", new House.Factory());
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
