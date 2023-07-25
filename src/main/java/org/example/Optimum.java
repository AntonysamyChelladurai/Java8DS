package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Optimum {

    public void integer(){
        Integer[] arr={8,5,4,8,12,7,10,10};
       Set<Integer>remduplicate= Arrays.stream(arr)
                .collect(Collectors.toSet());
       remduplicate.stream().forEach(System.out::println);

       Map<Integer, Long> duplicateList=Arrays.stream(arr)
                      // .filter(Arrays.stream(arr).anyMatch(value))
                               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      Set<Integer>keyset= duplicateList.keySet();

     List<Integer>duplicate= keyset.stream().filter(key->duplicateList.get(key)>=2)
              .collect(Collectors.toList());
     duplicate.stream().forEach(System.out::println);


    }

    public void method2(){
        Integer[] arr={8,5,4,8,12,7,10,10};
        Set<Integer>remduplicate= Arrays.stream(arr)
                .collect(Collectors.toSet());
        remduplicate.stream().forEach(System.out::println);

        Map<Integer, Long> duplicateList=Arrays.stream(arr)
                // .filter(Arrays.stream(arr).anyMatch(value))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Set<Integer>keyset= duplicateList.keySet();

        List<Integer>duplicate= keyset.stream().filter(key->duplicateList.get(key)>=2)
                .collect(Collectors.toList());
        duplicate.stream().forEach(System.out::println);


    }

}
