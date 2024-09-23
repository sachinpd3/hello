package FunctionalInterface;

public class Annonymousinner {
    public static void main(String[] args){
     Runnable r = new Runnable() {
         @Override
         public void run() {
         for(int i=0;i<20;i++){
    System.out.println("runnanle"+i);
}}};
Thread t = new Thread(r);
t.start();
        for(int i=0;i<20;i++){
            System.out.println("main"+i);
        }
assert (5>2);
    }
}
