package InnerClass.ExtendsExample;

public class ExtendsExample {

    public static void main(String[] args){

        Thread t = new Thread(){
           public void run(){
               for(int i=0;i<100;i++){
                   System.out.println("child");
               }
           }
        };
       t.start();
        for(int i=0;i<100;i++){
            System.out.println("main");
        }
    }

}
