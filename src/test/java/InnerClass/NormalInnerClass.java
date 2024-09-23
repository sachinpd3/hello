package InnerClass;

import java.security.PublicKey;

public class NormalInnerClass {
    class Inner{
        public void m1(){
            System.out.println("hello");
        }
    }
    public static void main(String[] args){
        NormalInnerClass obj = new NormalInnerClass();
        NormalInnerClass.Inner iobj=obj.new Inner();
        iobj.m1();
        System.out.println(iobj.getClass().getName());
    }
}