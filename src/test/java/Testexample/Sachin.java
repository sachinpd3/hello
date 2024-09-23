package Testexample;

import java.util.*;

public class Sachin {

    Sachin (){

    }
    Sachin(int a){

    }
    public void addition(int i){
        System.out.println("hello");
    }
    public static void addition(){
        System.out.println("hello");
    }
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        String str ="sachin";
        String nstr="";
        for(int i=0;i<str.length();i++){
         nstr= str.charAt(i)+nstr;
        }
        System.out.println(nstr);
        Map<Integer,String>mp = new HashMap<>();
        mp.put(101,"sachin");
        mp.put(102,"saket");
        mp.put(103,"ashish");
        mp.put(104,"perwez");
        mp.put(105,"sachin");
        mp.put(106,"saket");
        mp.put(107,"ashish");
        mp.put(108,"perwez");
        System.out.println(mp);
        Set st=mp.entrySet();
        Iterator it= st.iterator();
        while(it.hasNext()){
        Map.Entry et= (Map.Entry) it.next();
        System.out.println(et.getKey());
        System.out.println(et.getValue());
       }
    }

}


