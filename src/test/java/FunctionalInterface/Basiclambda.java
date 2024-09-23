package FunctionalInterface;

interface  Exam{
    void msg();

}
public class Basiclambda {
    public static void main(String[] args){
      Exam obj=  ()->{System.out.println("hoi");};
      obj.msg();
        Exam obj2=  ()->{System.out.println("hoi");};
    }
}
