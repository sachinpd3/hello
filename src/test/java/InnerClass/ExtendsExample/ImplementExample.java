package InnerClass.ExtendsExample;

public class ImplementExample {
    public static void main(String[] args){
        Runnable r = new Runnable(){
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    System.out.println("child");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<100;i++){
            System.out.println("main");
        }
    }
}
