package TestNG;

import org.testng.annotations.Test;

public class Day4 {


    @Test
    public void testrun(){
        Day3 obj=new Day3(4);
        System.out.println(obj.sum());
       System.out.println(obj.multiply());
    }
}
