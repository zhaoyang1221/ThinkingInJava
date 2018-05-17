package exercise_14;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/14 0014
 * Description:
 */
//: interfaces/HorrorShow.java
// Extending an interface with inheritance.

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    public void menace() {}
    public void destroy() {}
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    public void menace() {}
    public void destroy() {}
    public void kill() {}
    public void drinkBlood() {}
}

public class HorrorShow {
    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) { l.kill(); }
    public DangerousMonster dangerousMonsterMaker() {
        return new DangerousMonster() {
            @Override
            public void destroy() {
                System.out.println("DangerousMonster destroy");
            }

            @Override
            public void menace() {
                System.out.println("DangerousMonster menace");
            }
        };
    }

    public Vampire vampireMaker() {
        return new Vampire() {
            @Override
            public void drinkBlood() {
                System.out.println("Vampire drinkBlood");
            }

            @Override
            public void destroy() {
                System.out.println("Vampire destroy");
            }

            @Override
            public void kill() {
                System.out.println("Vampire kill");
            }

            @Override
            public void menace() {
                System.out.println("Vampire menace");
            }
        };
    }

    public static void main(String[] args) {
       HorrorShow horrorShow = new HorrorShow();
       horrorShow.dangerousMonsterMaker().destroy();
       horrorShow.vampireMaker().drinkBlood();
    }
} ///:~
