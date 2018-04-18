package exercise_6;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/16 0016
 * To change this template use File | Settings | File Templates.
 * Description:
 */

class SomeData{
    protected int i= 0;
}
class DataUtils{
    static void change(SomeData sd, int i){
        sd.i = i;
    }
}
public class Main {
    public static void main(String[] args) {
        SomeData someData = new SomeData();
        System.out.println(someData.i);
        DataUtils.change(someData, 100);
        System.out.println(someData.i);
    }
}