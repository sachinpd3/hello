package FunctionalInterface;

/**
 * Constructor Reference
 */
 class Employee {
    int salary;
    String name;

    Employee(int salary,String name){
        this.salary=salary;
        this.name=name;

    }
}

interface itr{
   public  Employee get(int salary,String name);
        }
public class Test {
     public static void main(String[] args){
         itr it=Employee::new;
      Employee ee=   it.get(101,"sachin");
      System.out.println("name:"+ee.name+" salary:"+ee.salary);

     }
}

