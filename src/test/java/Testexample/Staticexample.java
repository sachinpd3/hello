package Testexample;

public class Staticexample implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println("run is running : "+i);
        }

    }
}
