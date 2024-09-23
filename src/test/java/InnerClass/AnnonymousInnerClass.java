package InnerClass;

/**
 *   3 .class file will be generated.(including one of anonymous inner class)
 */

public class AnnonymousInnerClass {
public void taste(){
    System.out.println("spicy");
}}
class Test{
    public static void main(String[] args){
        AnnonymousInnerClass obj = new AnnonymousInnerClass(){
            public void taste(){
                System.out.println("chilly");
            }
        };
        obj.taste();
        AnnonymousInnerClass mobj= new AnnonymousInnerClass();
        mobj.taste();
        System.out.println(obj.getClass().getName());
        System.out.println(mobj.getClass().getName());

}

}


