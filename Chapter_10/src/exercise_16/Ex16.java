package exercise_16;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/14 0014
 * Description:
 */
interface Cycle {
    void ride();
}
interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    private Unicycle() {
        System.out.println("Unicycle()");
    }

    @Override
    public void ride() {
        System.out.println("Unicycle ride");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}


class Bicycle implements Cycle {
    private Bicycle() {
        System.out.println("Bicycle()");
    }

    @Override
    public void ride() {
        System.out.println("Bicycle ride");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle {
    private Tricycle() {
        System.out.println("Tricycle()");
    }

    @Override
    public void ride() {
        System.out.println("Tricycle ride");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}

public class Ex16 {
    public static void rideCycle(CycleFactory cycleFactory) {
        Cycle c = cycleFactory.getCycle();
        c.ride();
    }

    public static void main(String[] args) {
        rideCycle(Bicycle.factory);
        rideCycle(Unicycle.factory);
        rideCycle(Tricycle.factory);
    }
}