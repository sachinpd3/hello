package InnerClass;

 class NestedStatic {
     static class Test {
        public void m1() {
            System.out.println("---static---");
        }
    }
}
public class Example{
    public static void main(String[] args){
        NestedStatic.Test  t = new NestedStatic.Test();
        t.m1();
    }
}
