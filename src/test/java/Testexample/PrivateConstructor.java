package Testexample;

public class PrivateConstructor {
  private   PrivateConstructor (){
        System.out.println("i am private cons");
    }

    public static void main(String [] args){
        PrivateConstructor obj = new PrivateConstructor();
        ModifierExam obb= new ModifierExam();
    }
}
