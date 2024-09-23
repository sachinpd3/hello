package Testexample;

import java.util.function.Predicate;

public class CountNumberOfObject {
    static int count=0;
    {
       count= count+1;
    }
    CountNumberOfObject(){

    }
    CountNumberOfObject(int i){

    }

    CountNumberOfObject(double d){

    }

    public static void main(String[] args){
        CountNumberOfObject obj = new  CountNumberOfObject();
        obj.toString();
        CountNumberOfObject obj1 = new  CountNumberOfObject(100);
        CountNumberOfObject obj2 = new  CountNumberOfObject(7);
        CountNumberOfObject obj3 = new  CountNumberOfObject();
        System.out.println("number is"+count);
        Predicate<String> p = s -> s.length()>3;
       System.out.println( p.test("sachin"));
       String[] s = {"sachin","saket","ashish","shanu","perwez"};
       Predicate<String> ob= s1 -> s1.length()>5;
       for(String s2 : s){
           if(ob.test(s2)){
               System.out.println(s2);
           }
       }
    }
}
