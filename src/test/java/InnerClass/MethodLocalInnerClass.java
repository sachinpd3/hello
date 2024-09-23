package InnerClass;

/**
 * Inner Class inside Method
 */
public class MethodLocalInnerClass {
    public void m1() {
        class Inner {
            public void sum(int a, int b) {
                System.out.println("Sum:"+(a + b));
            }
        }
        Inner obj = new Inner();
        obj.sum(3, 4);
        System.out.println("--hello---");
        obj.sum(5, 7);
    }
    public static void main(String[] args) {
        MethodLocalInnerClass oobj = new MethodLocalInnerClass();
        oobj.m1();
    }
}
