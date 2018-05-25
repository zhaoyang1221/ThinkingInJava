package exercise_12;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/24 0024
 * Description:
 */
//: strings/Groups.java
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.*;
import static net.mindview.util.Print.*;

public class Ex12 {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";
    public static void main(String[] args) {
        Matcher m =
                Pattern.compile("(^[a-z]|\\s+[a-z])\\w+")
                        .matcher(POEM);
        Set<String> words = new LinkedHashSet<>();
        while(m.find()) {
            for(int j = 0; j <= m.groupCount(); j++)
                words.add(m.group());
        }
        print("words counts: " + words.size());
        print(words);
    }
} /* Output:
[the slithy toves][the][slithy toves][slithy][toves]
[in the wabe.][in][the wabe.][the][wabe.]
[were the borogoves,][were][the borogoves,][the][borogoves,]
[mome raths outgrabe.][mome][raths outgrabe.][raths][outgrabe.]
[Jabberwock, my son,][Jabberwock,][my son,][my][son,]
[claws that catch.][claws][that catch.][that][catch.]
[bird, and shun][bird,][and shun][and][shun]
[The frumious Bandersnatch.][The][frumious Bandersnatch.][frumious][Bandersnatch.]
*///:~
