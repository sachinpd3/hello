package FunctionalInterface;
/**
 * Method Reference
 */

class Person{
    public  void m1(){
        for(int i=0;i<10;i++){
            System.out.println("child"+i);
        }
    }
}
public class TestMethodReference {
public static void main(String [] args){
    Person p = new Person();
    Runnable r = p::m1;
    Thread t = new Thread(r);
    t.start();
    for(int i=0;i<10;i++){
        System.out.println("main"+i);
    }
}
}
