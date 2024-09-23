package InterfaceNesting;

 interface NestedInterface {
    public void m1();
    interface Inside{
        public void m2();
    }
}
class Test1 implements NestedInterface{

    @Override
    public void m1() {
        System.out.println("outer interface");
    }
}
class Test2 implements NestedInterface.Inside{
    @Override
    public void m2() {
        System.out.println("ineer interface");
    }
}

public class Example
{
public static void main(String[] args){
    Test1 obj = new Test1();
    obj.m1();

    Test2 obj2 = new Test2();
    obj2.m2();

}
}