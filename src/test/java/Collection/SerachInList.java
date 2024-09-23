package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparatoer implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
Integer I1= (Integer) o1;
        Integer I2= (Integer) o2;
return I2.compareTo(I1);
    }

}

public class SerachInList {
    public static void main(String []args){
        ArrayList al= new ArrayList();
        al.add(10);
        al.add(15);
        al.add(99);
        al.add(1);
        al.add(50);
        Collections.sort(al,new MyComparatoer());
        System.out.println(al);;
      System.out.println(Collections.binarySearch(al,15,new MyComparatoer()));

    }
}
