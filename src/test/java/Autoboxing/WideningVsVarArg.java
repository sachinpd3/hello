package Autoboxing;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class WideningVsVarArg {
    public static void m1(int... i){
        System.out.println("Autoboxing");
    }

    public static void m1(long l){
        System.out.println("Widening");
    }

    public static void main(String[] args){
        int x =10;
        m1(x);
        Integer arr[]={3,4,5,6,8};
        List<Integer> lt=Arrays.asList(arr);
        Collection i;

    }
}
