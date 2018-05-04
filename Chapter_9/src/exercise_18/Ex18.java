package exercise_18;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/3 0003
 * To change this template use File | Settings | File Templates.
 * Description:
 */
interface Cycle {
    void ride();
}

class Unicycle implements Cycle {
    public Unicycle() {
        System.out.println("Unicycle()");
    }

    @Override
    public void ride() {
        System.out.println("Unicycle ride");
    }
}


class Bicycle implements Cycle {
    public Bicycle() {
        System.out.println("Bicycle()");
    }

    @Override
    public void ride() {
        System.out.println("Bicycle ride");
    }
}

class Tricycle implements Cycle {
    public Tricycle() {
        System.out.println("Tricycle()");
    }

    @Override
    public void ride() {
        System.out.println("Tricycle ride");
    }
}

interface CycleFactory {
    Cycle getCycle();
}

class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
public class Ex18 {
    public static void rideCycle(CycleFactory cycleFactory) {
        Cycle c = cycleFactory.getCycle();
        c.ride();
    }

    public static void main(String[] args) {
        rideCycle(new BicycleFactory());
        rideCycle(new TricycleFactory());
        rideCycle(new UnicycleFactory());
    }
}