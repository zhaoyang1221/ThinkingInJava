package exercise_11;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/28 0028
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class StringChanger {
    String process(String s) {
        char[] charArr = new char[s.length()];
        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i+=2) {
                charArr[i] = s.charAt(i + 1);
                charArr[i + 1] = s.charAt(i);
            }
        }
        else {
            for (int i = 0; i< s.length() - 1; i+=2) {
                charArr[i] = s.charAt(i + 1);
                charArr[i + 1] = s.charAt(i);
            }
            charArr[s.length() - 1] = s.charAt(s.length() - 1);
        }
        return new String(charArr);
    }
}

class StringChangerAdapter implements Processor{
    private StringChanger stringChanger;
    StringChangerAdapter(StringChanger stringChanger) {
        this.stringChanger = stringChanger;
    }

    @Override
    public String name() {
        return "StringChanger";
    }

    @Override
    public String process(Object input) {
        return stringChanger.process((String)input);
    }
}


public class Ex11 {
    public static void main(String[] args) {
        String s = "hello";
        StringChangerAdapter stringChangerAdapter = new StringChangerAdapter(new StringChanger());
        Apply.process(stringChangerAdapter, s);

    }
}