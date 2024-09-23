package Collection;

import java.util.HashMap;
import java.util.WeakHashMap;

class Temp{
   public String toString(){
       return "temp";
   }
   public void finalize(){
       System.out.println("--finalize--");
   }
}
public class MapWithGarbageCollector {
    public static void main(String[] args){
        Temp obj = new Temp();
        WeakHashMap mp = new WeakHashMap();
        mp.put(obj,"sachin");
        obj=null;
        System.gc();
        System.out.println(mp);
    }

}
