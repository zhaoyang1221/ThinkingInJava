package exercise_1;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/15 0015
 * Description:
 */
public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }
    void hop() {
        System.out.println(gerbilNumber + "号沙鼠正在跳跃！");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> arrayList = new ArrayList<>();
        arrayList.add(new Gerbil(0));
        arrayList.add(new Gerbil(1));
        arrayList.add(new Gerbil(2));

        for (int i = 0;i< arrayList.size(); i++) {
            arrayList.get(i).hop();
        }
    }
}