package ExceptionHandling;

public class Test4 extends Exception{
    Test4(String str){
        super(str);

    }
    public static void main(String[] args){
        try {
            throw new Test4("i am psrent");
        } catch (Test4 e) {
        System.out.println(e.getMessage());

        }

    }
}
