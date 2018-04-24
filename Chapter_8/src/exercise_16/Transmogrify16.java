package exercise_16;


/**
 * @author zhaoyang on 2018/4/24 0024.
 */

class AlertStatus {
    public void alert(){}
}

class NormalStatus extends AlertStatus {
    public void alert() {
        System.out.println("normal status");
    }

}

class LowStatus extends AlertStatus {
    public void alert() {
        System.out.println("low status");
    }
}

class HighStatus extends AlertStatus {
    public void alert() {
        System.out.println("high status");
    }
}

class StarShip {
    private AlertStatus status = new NormalStatus();
    public void changeToHighStatus() {
        status = new HighStatus();
    }
    public void changeToLowStatus() {
        status = new LowStatus();
    }
    public void printStatus() {
        status.alert();
    }
}
public class Transmogrify16 {
    public static void main(String[] args) {
        StarShip starShip = new StarShip();
        starShip.printStatus();
        starShip.changeToHighStatus();
        starShip.printStatus();
        starShip.changeToLowStatus();
        starShip.printStatus();
    }
}
