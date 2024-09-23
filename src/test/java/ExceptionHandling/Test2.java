package ExceptionHandling;

public class Test2 {
    public static void dostuff(){
        domorestuff();
        System.out.println(10/0);
    }
    public static void domorestuff(){
        System.out.println("hello");
    }
    public static void main(String[] args){
        dostuff();

    }
}
