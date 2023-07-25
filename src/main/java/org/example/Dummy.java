package org.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dummy {
    public void method1(){
        String test="a1b2c3";
        String[] tokens =test.split("\\t");
        for(String s : tokens)
            System.out.println(s+ " ");
    }
    public void method2(){
        int arr[] = new int[10];
        int i=5;
        arr[i++] = ++i+i++;
        System.out.println(arr[5]+":"+arr[6]);
    }

    public void reverseString(){
        String str = "quick brown fox jumps over lazy dog";
        System.out.println("Original String :: "+str);
        String revesString=Stream.of(str).map(s -> new StringBuilder(s).reverse()).collect(Collectors.toList()).toString();
        System.out.println("Reverse String :: "+ revesString);
    }

    public void sumFirstDigit2(){

       int[] arr= {23,45,22,67,52,222,2};
        int no=9834;
        /*double value = Math.log10(9834);
        System.out.println("Value :: "+value);
        System.out.println("Value :: "+ Math.pow(10,value));
        System.out.println("Value :: "+ (int)Math.floor(Math.pow(10,value)));
        System.out.println("Value :: "+(int) no/(int)Math.floor(Math.pow(10,value)));*/

        int digits = (int)(Math.log10(no));

        // Find first digit
        no = (int)(no / (int)(Math.pow(10, digits)));

        // Return first digit
        System.out.println("First digit :: "+no);
        //return n;

        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));

    }

}
