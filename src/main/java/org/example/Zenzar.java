package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Zenzar {

    public void task(){
        List<Integer> arr=new ArrayList();
        arr.add(3);
        arr.add(8);
        arr.add(5);
        arr.add(7);
        arr.add(2);

        Predicate findint= e->(int)e==0;
        boolean result=arr.stream().anyMatch(findint);
        System.out.println("result :: "+result);
    }

}
