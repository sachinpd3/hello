package TestNG;

public class Day3 extends  Day5{

    int a;

    public Day3(int a){
        super(a);
        this.a=a;
    }
    public int sum() {
        a = a + 3;
        return a;
    }

    public int subtract() {
        a = a - 1;
        return a;
    }

}
