package exercise_2;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/7 0007
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MyString {
    String s = "hello";

    @Override
    public String toString() {
        return "MyString{" +
                "s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(5);
        for (int i = 0; i < 5; i++) {
            sequence.add(new MyString());
        }

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}