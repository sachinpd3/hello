package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeSortingCustomise implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
       EmployeeSorting e1= (EmployeeSorting) o1;
        EmployeeSorting e2= (EmployeeSorting) o2;
        String name1=e1.name;
        String name2=e2.name;
      return   name1.compareTo(name2);
    }
    public static void main(String[] args){
        EmployeeSorting e1 = new EmployeeSorting("sachin",105);
        EmployeeSorting e2 = new EmployeeSorting("ashish",205);
        EmployeeSorting e3 = new EmployeeSorting("saket",115);
        EmployeeSorting e4 = new EmployeeSorting("perwez",95);
        TreeSet t = new TreeSet(new EmployeeSortingCustomise());
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        System.out.println(t);
    }
}
