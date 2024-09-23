package Testexample;
import org.example.Mainexample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Testfolder {

  /**
    static {
        System.out.println("static");
        System.loadLibrary("");
    }
    {
        System.out.println("instance block");
    }
    public void m1(final int x,int y){
      //  x=100;
        y=200;
        System.out.println("x is"+x +"y is"+y);
    }*/


    public static void main(String[] Sachin){
        int num=5;
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=i*fact;
        }
        System.out.println(fact);

        String str="programming";
        Set<Character> st=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            st.add(str.charAt(i));
        }
for(Character c : st){
    System.out.print(c);
}

        Integer i = new Integer(10);
i.intValue();
String strnum=Integer.toString(9);
Integer ii   =10;

    }
}
