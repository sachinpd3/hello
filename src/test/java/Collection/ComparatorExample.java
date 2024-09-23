package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer I1= (Integer) o1;
        Integer I2= (Integer) o2;
        if(I1>I2){
            return -1;
        }else if(I1<I2){
            return +1;
        }
        else{
            return 0;
        }
    }

    public static void main(String []args){
        TreeSet<Integer> t = new TreeSet<>(new ComparatorExample());
        t.add(5);
        t.add(10);
        t.add(4);
        t.add(11);
        t.add(1);
        t.add(6);
       System.out.println(t);
    }
}
