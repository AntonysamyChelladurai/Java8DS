package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Capgemini {

public void test1(){

    System.out.println("Capgemini \n");
    int a[] ={1,1,2,2,2,3,3,3,3,4,5,6,6,6,6,6};

    Map<Integer, Long> grpmap=Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    grpmap.entrySet().stream().sorted(Map.Entry.<Integer, Long>comparingByValue().reversed()).forEach(e-> {
       // for (int i = 0; i < e.getValue(); i++) {
            System.out.print(e.getKey());
    //    }
    });
}


}
