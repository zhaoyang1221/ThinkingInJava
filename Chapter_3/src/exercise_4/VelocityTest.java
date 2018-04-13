package exercise_4;

class VelocityCalculator {
    static double getVelocity(double distance, double time) {
        if (time == 0) {
            return -1;
        } else {
            return distance / time;
        }
    }
}
public class VelocityTest {
    public static void main(String[] args) {
        double distance = 700.5;
        double time = 20;
        double velocity = VelocityCalculator.getVelocity(distance, time);
        System.out.println("Distance: " + distance);
        System.out.println("Time: " + time);
        System.out.println("Velocity: " + velocity);
    }
}
