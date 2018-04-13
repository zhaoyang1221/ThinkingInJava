package exercise_14;

import javax.tools.ForwardingFileObject;

public class StringCompareTest {
    public static void main(String[] args) {
        String st1 = new String("aaa");
        String st2 = new String ("aaa");
//        String st1 = "aaa";
////        String st2 = "aaa";

        foo(st1, st2);
    }

    public static void foo(String st1, String st2) {
        System.out.println("st1 == st2 : " + String.valueOf(st1 == st2) );
        System.out.println("st1 equals st2 : " + String.valueOf(st1.equals(st2)) );
        System.out.println("st1 != st2 : " + String.valueOf(st1 != st2) );

    }
}
