package Collection;
/**
 * This example also contains garbage collector
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    @Override
    protected void finalize(){
        System.out.println("finalize");
    }
    public static void main(String[] args){
        HashMap<Integer,String > mp = new HashMap<>();
        mp.put(101,"sachin");
        mp.put(102,"saket");
        mp.put(103,"perwez");
        mp.put(104,"ashish");
        System.out.println(mp);
      Set mapentry=mp.entrySet();
      Iterator it= mapentry.iterator();
      while(it.hasNext())
      {
      Map.Entry obj= (Map.Entry) it.next();
      System.out.println("Key is :"+obj.getKey() +" Value is :"+obj.getValue());
      if(obj.getValue().equals("perwez"))
      {
          obj.setValue("shanu");
      }
      }
      System.out.println(mp);
        MapExample obbbj= new MapExample();
        obbbj=null;
      System.gc();
    }
}
