package Testexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Roleed {
    public static void main(String[] args)  {
        int k=1;
        for(int i =1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

String str ="a1b6c9d5";
String nstr= str.replaceAll("[^0-9]","")   ;
Integer i = Integer.valueOf(nstr);
System.out.println(i);
int remainder;
int sum=0;
while(i>0){
    remainder=i%10;
    sum=sum+remainder;
    i=i/10;
}
System.out.println(sum);
String ostr = "abcdabccdeda";
        HashMap<Character,Integer> mp = new HashMap<>();
        char[] arr=ostr.toCharArray();
        int ii=1;
        for(char c : arr){
       Integer count=  mp.get(c);
            if(mp.get(c)==null)
            {
                mp.put(c,1);
            }
          else{
              mp.put(c,count+1);
            }
        }
        System.out.println(mp);
      Set st=mp.entrySet();
   Iterator it= st.iterator();
   while(it.hasNext())
   {
   Map.Entry et= (Map.Entry) it.next();
   System.out.println(et.getKey()+" is occured "+et.getValue());
   }
    }
}
