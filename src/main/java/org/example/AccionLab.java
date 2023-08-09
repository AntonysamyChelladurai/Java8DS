package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AccionLab {

    /*
    * Write a program to sort the list based on the max occurrences
        List<Integer> list = Arrays.asList(2,3,2,2,5,5,6,5,7,5,3,1);

        input : {2,3,2,2,5,5,6,5,7,5,3,1}
        output: {5,5,5,5,2,2,2,3,3,6,7,1}

        List<Integer> list = List.of(2,3,2,2,5,5,6,5,7,5,3,1);
    * */
    public void task() {
        System.out.println("\n AccionLab");
        List<Integer> list = Arrays.asList(2, 3, 2, 2, 5, 5, 6, 5, 7, 5, 3, 1);
        Map<Integer, Long> accurmap = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Collection<Long> mapValue = accurmap.values();
        accurmap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(System.out::println);//.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(" \n Second sorting approach");
        accurmap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed()).forEach(entr -> {
                    for (int i = 0; i < entr.getValue(); i++) {
                        System.out.print(entr.getKey());
                    }
                });
        System.out.println("\n Third sorting approach");
        Map<Integer, Long> sortedMap = accurmap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v2, LinkedHashMap::new));
        sortedMap.entrySet().stream().forEach(ent -> {
            for (int i = 0; i < ent.getValue(); i++) {
                System.out.print(ent.getKey());
            }
        });

        //System.out.print(ent.getKey() +"::"+ ent.getValue()));

        //   list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        // tmp= list.stream().filter(e->list.contains()).collect(Collectors.toList());
    }

}
