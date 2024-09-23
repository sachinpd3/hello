package Second;


import java.util.function.IntFunction;
import java.util.function.IntPredicate;

class Sachin{
    public static void m1(){
        System.out.println("sachin");
    }
}


class Person {
    public static void ex(){
        System.out.println("i am person static");
    }
    Person(int a){
        System.out.println("p");
    }

    public static void main(String[] args) {
        System.out.println("main");
        int i = 6;
        int j = 6;
        if (i == j)
            System.out.println("pass");
        String str = new String("hello");
        String nstr = new String("hello");
        if (str == nstr)
            System.out.println("String pass");
        Integer it = new Integer(3);
        Integer itn = new Integer(3);
        if(it.equals(itn)){
            System.out.println("integer is eqil");
        }
        IntFunction ifs=s->s*4;
        ifs.apply(3);

    }
}
