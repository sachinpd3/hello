package Testexample;

public interface Intra {
    void msg(int a,int b);
    public static void m1(){
        System.out.println("i am static void-Interface");
    }

}

class Test implements Intra{
    @Override
    public void msg(int a, int b) {
        System.out.println("i am static void-class");
    }
    public static void main(String[] args){
    Intra obj= (a,b)->System.out.println(a+b);
    obj.msg(5,8);
    Test obj1 = new Test();
    Intra.m1();

    }


}
