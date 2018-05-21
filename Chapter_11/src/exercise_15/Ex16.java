package exercise_15;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/21 0021
 * Description:
 */

import net.mindview.util.Stack;

public class Ex16 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
        f(stack, s);
    }

    public static void f(Stack<Character> stack, String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                stack.push(s.charAt(i+1));
            } else if (s.charAt(i) == '-') {
                System.out.println(stack.pop());
            }
        }
    }
}