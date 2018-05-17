package exercise_9;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/11 0011
 * Description:
 */
interface A {
    String printA();
}

public class Ex9 {
    public A a(String s){

        class PA implements A {
            private String a;
            private PA(String a) {
                this.a = a;
            }
            @Override
            public String printA() {
                return a;
            }
        }

        return new PA(s);
    }

    public static void main(String[] args) {
        Ex9 ex9 = new Ex9();
        A a = ex9.a("hahhhaha");

    }
}