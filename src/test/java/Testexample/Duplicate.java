package Testexample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Duplicate {
    public static void main(String [] args){
        int[] arr={1,4,5,6,4,2,7,11,4,14,2,10};
        int [] arrrn=new int[arr.length];
        int jl=  arr.length;
        /**
         * to find biggest number in Array
         */
        int temp=0;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1])
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

            }
        }
        System.out.println("largest"+arr[arr.length-1]);


        /**
         * to find duplicate in array
         */
        ArrayList lt = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    if(!lt.contains(arr[i]))
                    {
                        lt.add(arr[i]);
                        System.out.println("duplicte "+arr[i]);
                    }
                    break;
                }

            }
        }

        /**
         * to Reverse array of integers
         */
        for(int i=0;i< arr.length;i++){
            arrrn[jl-1]=arr[i];
            jl=jl-1;
        }
            for(int jj: arrrn){
                System.out.print(jj+" ");
            }

/**
 * To Remove duplicate from Array
 */
        HashSet<Integer> ht=new HashSet<>();
        for(int i : arr)
        {
            ht.add(i);
        }
System.out.println("");
     for(Integer j : ht){
        System.out.print(j+" ");
     }

    }

}
