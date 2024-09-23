package Collection;

import java.util.Hashtable;

class TempTable{
    int i;
    public TempTable(int i){
        this.i=i;
    }
    public int hashCode(){

        return i;
    }

    public String toString(){
        return i+"";
    }
}

public class HashtableExam {

    public static void main(String[] args){
        Hashtable h = new Hashtable();
        h.put(new TempTable(5),"A");
        h.put(new TempTable(11),"B");
        h.put(new TempTable(20),"C");
        h.put(new TempTable(7),"D");
        h.put(new TempTable(3),"E");
        System.out.println(h);

    }

}
