package exercise_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/24 0024
 * Description:
 */
public class Ex10 {
    public static void main(String[] args) {
        if (args.length < 2) {
            print("Usage:\njava TestRegularExpression " +
                    "characterSequence regularExpression+");
            System.exit(0);

        }
        print("Input: \"" + args[0] + "\"");
        for (String arg : args) {
            print("Regular expression: \"" + arg + "\"");
            Pattern pattern = Pattern.compile(arg);
            Matcher m = pattern.matcher(args[0]);
            if (!m.find()) {
                print("No match found for " + "\"" + arg + "\"");
            }
            m.reset();
            while(m.find()) {
                print("Match \"" + m.group() + "\" at position " +
                        m.start() + ((m.end() - m.start() < 2) ? "" :  ("-" + (m.end() - 1))));
            }
        }
    }

}