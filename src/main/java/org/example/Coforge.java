package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Coforge {
    public void method1(){
        Integer[] input={2,0,5,0,3,9,0,1,2};
        //Arrays
        List temp= Arrays.asList(input);
        List<Integer> l1= (List<Integer>) temp.stream().filter(e->(int)e==0).collect(Collectors.toList());//Fileter(e->e == 0).collect(Colleters.tolist);
        temp.stream().filter(val-> (int)val > 0).forEach(e->l1.add(Integer.parseInt(e.toString())));
        //collect(Collectors.toList())//.forEach(l1.add());//foreach(l1.add(val));
        l1.stream().forEach(System.out::println);
    }
}
