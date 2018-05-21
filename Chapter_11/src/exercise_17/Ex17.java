package exercise_17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/21 0021
 * Description:
 */
class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }
    void hop() {
        System.out.println(gerbilNumber + "号沙鼠正在跳跃！");
    }
}

public class Ex17 {

    public static void main(String[] args) {
        Map<String, Gerbil> gerbils = new HashMap<>();
        gerbils.put("Fuzzy", new Gerbil(0));
        gerbils.put("Spot", new Gerbil(1));
        gerbils.put("Speedy", new Gerbil(2));
        gerbils.put("Dopey", new Gerbil(3));
        gerbils.put("Sleepy", new Gerbil(4));

        Iterator<String> iterator = gerbils.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Gerbil gerbil = gerbils.get(key);
            System.out.print(key + ": ");
            gerbil.hop();

        }
    }
}