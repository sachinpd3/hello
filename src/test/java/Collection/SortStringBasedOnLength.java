package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class SortStringBasedOnLength implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public static void main(String[] args){
        TreeSet t = new TreeSet<>();
        t.add("Sachin");
        t.add("ZA");
        t.add("ABC");
        System.out.println(t);
    }
}
