package exercise_4;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/16 0016
 * Description:
 */
public class Generator {
    int key = 0;
    public String next() {
        switch (key) {
            default:
            case 0:
                key++;
                return "Snow White";
            case 1:
                key++;
                return "Bashful";
            case 2:
                key++;
                return "Avengers";
            case 3:
                key++;
                return "Dopey";
            case 4:
                key++;
                return "Grumpy";
            case 5:
                key++;
                return "Iron man";
            case 6:
                key++;
                return "Spider";
            case 7:
                key = 0;
                return "Wonder";
        }
    }
    public void fill(String[] a) {
        for (int i = 0; i < a.length; i++){
            a[i] = next();
        }
    }

    public Collection fillCollection(Collection<String> c, int n) {
        for (int i = 0; i < n; i++) {
            c.add(next());
        }
        return c;
    }

    public static void main(String[] args) {
        Generator generator  = new Generator();
        String[] a = new String[10];
        generator.fill(a);

        ArrayList<String> arrayList = new ArrayList<>();
        generator.fillCollection(arrayList, 10);
        System.out.println(arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        generator.fillCollection(linkedList, 10);
        System.out.println(linkedList);

        HashSet<String> hashSet = new HashSet<>();
        generator.fillCollection(hashSet, 10);
        System.out.println(hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        generator.fillCollection(linkedHashSet, 10);
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        generator.fillCollection(treeSet, 10);
        System.out.println(treeSet);



    }

}