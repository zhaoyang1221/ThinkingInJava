package exercise_29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static net.mindview.util.Print.print;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/11 0011
 * Description:
 */
public class Ex29 {
    static void f1(Holder<List<?>> holder) {
        System.out.println("holder: " + holder);
        System.out.println(holder.get());
        holder.set(Arrays.asList(1,2,3,4));
        System.out.println(holder.get());
        int[] ia = {1,2,3,4};
        System.out.println(holder.equals(ia));
        List iaList = Arrays.asList(ia);
        System.out.println(holder.equals(ia));


    }
    static void f2(List<Holder<?>> list) {
        print("Calling methods for the List: ");
        print("list = " + list);
        print("Adding Integer, String, Double");
        list.add(new Holder<Integer>(1));
        list.add(new Holder<String>("two"));
        list.add(new Holder<Double>(3.0));
        print("list = " + list);
        print("Elements of list: ");
        for(Holder h : list)
            print("h.get() = " + h.get());
        print("Adding Float");
        list.add(3, new Holder<Float>(4.0f));
        print("list = " + list);
        print("Elements of list: ");
        for(Holder h : list)
            print("h.get() = " + h.get());
        print("list.clear()");
        list.clear();
        print("list = " + list);
        Collection<Holder<?>> c =
                new ArrayList<Holder<?>>();
        c.add(new Holder<String>("one"));
        c.add(new Holder<Float>(2.0f));
        c.add(new Holder<Double>(3.0));
        list.addAll(c);
        print("Adding String, Float, Double");
        print("list = " + list);
        print("Elements of list: ");
        for(Holder h : list)
            print("h.get() = " + h.get().getClass().getSimpleName()
                    + " " + h.get());
        list.add(3, new Holder<String>("four"));
        print("Elements of list: ");
        for(Holder h : list)
            print("h.get() = " + h.get().getClass().getSimpleName()
                    + " " + h.get());
        Object listClone = ((ArrayList)list).clone();
        print("((ArrayList)list).clone() = " +  listClone);
        print("((ArrayList)list).clone().getClass() = " +
                ((ArrayList)list).clone().getClass());
        // Appears to be an ArrayList, but cannot assign:
        // ArrayList alistClone = ((ArrayList)list).clone(); // found Object
        print("Replacing element with h4, new Holder<Integer>(4)");
        Holder<Integer> h4 = new Holder<Integer>(4);
        list.set(3, h4);
        print("Elements of list Holders: ");
        for(Holder h : list)
            print(h.get().getClass().getSimpleName()
                    + " " + h.get());
        print("list.contains(list.set(3, h4): " +
                list.contains(list.set(3, h4)));
        print("list.contains(4): " + list.contains(4));
        print("list.contains(h4): " + list.contains(h4));
        print("Adding null member to list");
        list.add(null);
        print("list.contains(null): " + list.contains(null));
        print("list.get(0).get(): " + list.get(0).get());
        print("list.indexOf(h4) = " + list.indexOf(h4));
        print("list.indexOf(null) = " + list.indexOf(null));
        print("list.isEmpty(): " + list.isEmpty());
        print("list.lastIndexOf(null) = " + list.lastIndexOf(null));
        print("Removing index 0");
        list.remove(0);
        print("Elements of list Holders: ");
        for(Holder h : list) {
            if(h == null) print("null");
            else
                print(h.get().getClass().getSimpleName()
                        + " " + h.get());
        }
        print("Removing null");
        print("Elements of list Holders: ");
        for(Holder h : list) {
            if(h == null) print("null");
            else
                print(h.get().getClass().getSimpleName()
                        + " " + h.get());
        }
        // Error: removeRange has protected access:
        // ((ArrayList)list).removeRange(0,2);
        print("list.size() = " + list.size());
        Object[] oa = list.toArray();
        print("list.toArray() = ");
        for(int i = 0; i < oa.length; i++)
            print(oa[i] + " ");
        print();
        Holder[] ha = ((ArrayList<Holder<?>>)list).toArray(new Holder[4]);
        print("(ArrayList<Holder<?>>list).toArray(new Holder[4]) = ");
        for(int i = 0; i < ha.length; i++)
            print(ha[i] + " ");
        print();
        print("Holder[4] Holders are holding: ");
        for(Holder h : ha) {
            if(h == null) print("null");
            else print(h.get());
        }
        print();

        print("Calling methods for the Holder: ");
        print("list = " + list);
        print("Three Holders (one null) in list:");
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == null) print("null");
            else
                print(list.get(i).getClass().getSimpleName());
        }
        list.remove(3);
        print("Holders are holding:");
        for(Holder h : list) print(h.get());
        Holder<?> h1 = list.get(0);
        Holder<?> h2 = list.get(1);
        Holder<?> h3 = list.get(2);
        print(list.get(0).getClass() + ": "
                + list.get(0).get().getClass().getSimpleName() + ", "
                + list.get(0).get());
        print(list.get(1).getClass() + ": "
                + list.get(1).get().getClass().getSimpleName() + ", "
                + list.get(1).get());
        print(list.get(2).getClass() + ": "
                + list.get(2).get().getClass().getSimpleName() + ", "
                + list.get(2).get());
        // Error: cannot set <?> to int or Object:
        // h3.set(5);
        // h2.set(new Object());

    }
    public static void main(String[] args) {
        print("new Holder<List<?>> holder");
        f1(new Holder<List<?>>());
        print();
        print("List<Holder<?>> list = new ArrayList<Holder<?>>();");
        List<Holder<?>> list = new ArrayList<Holder<?>>();
        f2(list);
    }
}