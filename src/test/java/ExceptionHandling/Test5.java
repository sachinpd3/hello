package ExceptionHandling;

public class Test5 {
    public static void main(String[] args){

      try{
          System.out.println(5/0);
      }
      catch (ArithmeticException e){
          System.out.println(5/1);
      }
      catch (Exception e){
          System.out.println(5/1);
      }
      







    }
}
