package exercise_30;

import exercise_29.Holder;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/12 0012
 * Description:
 */
public class Ex30 {
    public static void main(String[] args) {
        Holder<Integer> intholder = new Holder<>();
        Holder<Short> shortHolder = new Holder<>();
        Holder<Long> longHolder = new Holder<>();
        Holder<Double> doubleHolder = new Holder<>();
        Holder<Float> floatHolder = new Holder<>();
        Holder<Byte> byteHolder  = new Holder<>();
        Holder<Character> characterHolder = new Holder<>();
        Holder<Boolean> booleanHolder = new Holder<>();

        //自动装包和拆包
        characterHolder.set('a');
        System.out.println(characterHolder.get());

    }
}