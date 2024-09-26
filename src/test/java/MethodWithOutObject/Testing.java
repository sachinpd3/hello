package MethodWithOutObject;
import org.testng.annotations.Test;
public class Testing {



    @Test
    public void test1(){
First obj = new First(3);
System.out.println(obj.sum());
System.out.println(obj.Multiply());
    }
}
