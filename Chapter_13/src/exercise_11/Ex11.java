package exercise_11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/24 0024
 * Description:
 */
public class Ex11 {
    public static void main(String[] args) {
        String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+[aeiou]\\b";
        String s = "Arline ate eight apples and one orange while Anita hadn't any";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(s);
        while (m.find()) {
            System.out.println("Match \"" + m.group() + "\" at " + m.start());
        }
    }
}