package Collection;

import java.util.TreeSet;

/**
 * Write an Employee class where sorting is based on Employee id
 */

public class EmployeeSorting implements Comparable {
    String name;
    int id;

    public EmployeeSorting(String name,int id){
        this.name=name;
        this.id=id;
    }
    @Override
    public int compareTo(Object o) {
        int id1=this.id;
        EmployeeSorting e = (EmployeeSorting) o;
       int id2=e.id;
       if(id1<id2){
           return -1;
       }else if(id1>id2){
           return 1;
       }
       else {
           return 0;
       }
    }

    public String toString(){

        return name+"--"+id;
    }
    public static void main(String[] args){
        EmployeeSorting e1 = new EmployeeSorting("sachin",105);
        EmployeeSorting e2 = new EmployeeSorting("ashins",205);
        EmployeeSorting e3 = new EmployeeSorting("saket",115);
        EmployeeSorting e4 = new EmployeeSorting("perwez",95);
        TreeSet t = new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        System.out.println(t);
    }
}
