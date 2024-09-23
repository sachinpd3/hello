package ExceptionHandling;

public class Test3 {
    public static void dostuff(){
        domorestuff();
        System.out.println("hi");
    }
    public static void domorestuff(){
        System.out.println("hello");
    }
    public static void main(String[] args){
        dostuff();
        System.out.println(10/0);
    }
}
