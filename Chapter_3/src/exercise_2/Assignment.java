package exercise_2;

class Tank {
    float level;
}
public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 12.5f;
        t2.level = 200.7f;
        System.out.println("1: t1.level: "+ t1.level + ", t2.level: " + t2.level);
        t1 = t2;
        System.out.println("2: t1.level: "+ t1.level + ", t2.level: " + t2.level);
        t1.level = 400.6f;
        System.out.println("3: t1.level: "+ t1.level + ", t2.level: " + t2.level);


    }
}
