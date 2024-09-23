package Testexample;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String []args){
        String str="palbdlavi";
        HashSet<Character> st = new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            st.add(str.charAt(i));
        }
        for(Character cc : st){
            System.out.print(cc);
        }
    }



}
