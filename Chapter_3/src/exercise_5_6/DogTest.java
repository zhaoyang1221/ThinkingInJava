package exercise_5_6;

class Dog {
    String name;
    String says;
}

/**
 * == 比较的是是否是同一个对象，即使内容相同也可能不是同一个对象
 *
 * equals 是在对象和包装类中的方法，来比较对象中的内容
 * 需要注意：默认的equals也是比较的引用，不是比较的内容；
 * 现在大多数Java类中的equals方法能比较内容是因为重写该方法。
 */
public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";

        Dog dog2 = new Dog();
        dog2.name = "scruffy";
        dog2.says = "Wurf!";

        System.out.println("dog1: name:" + dog1.name + ", says: " + dog1.says);
        System.out.println("dog2: name:" + dog2.name + ", says: " + dog2.says);

        Dog dog3 = dog1;
        System.out.println("dog1 == dog2:" + (dog1 == dog2));
        System.out.println("dog1 equals dog2:" + (dog1.equals(dog2)));

        System.out.println("dog2 == dog3:" + (dog2 == dog3));
        System.out.println("dog2 equals dog3:" + (dog2.equals(dog3)));

        System.out.println("dog1 == dog3:" + (dog1 == dog3));
        System.out.println("dog1 equals dog3:" + (dog1.equals(dog3)));

    }
}
