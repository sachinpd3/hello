package ExceptionHandling;

/**
 * Default Exception Handling by JVM
 */
public class Test {
    public static void dostuff(){
        domorestuff();
    }
    public static void domorestuff(){
        System.out.println(5/0);
    }
    public static void main(String[] args){
        dostuff();

    }
}
