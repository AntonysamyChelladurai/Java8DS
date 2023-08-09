package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Boeing {

    public void test1(){
        System.out.println(" ---- Boeing ----  ");
       // -9999;
       int[] arr={377,-28,-37,-9999,272,3,73,38,-9999,3,8,4,6,-9999};
       //nt count=0;
      //  count=Arrays.stream(arr).boxed().filter(e->e==-9999).collect(Collectors.toList()).size();

        List l1=Arrays.stream(arr).boxed().filter(e->e!=-9999).collect(Collectors.toList());
        l1.addAll(l1.size(),Arrays.stream(arr).boxed().filter(e->e==-9999).collect(Collectors.toList()));
        //Arrays.stream(arr).boxed().forEach();
        /*Arrays.stream(arr).boxed().filter(e->e<0).forEach(e-> {
            for (int i = l1.size(); i <arr.length ; i++) {
                l1.add(e);
            }
        });*/
        l1.stream().forEach(System.out::println);
    }

    public void test2(){
        int[] arr={377,-28,-37,-9999,272,3,73,38,-9999,3,8,4,6,-9999};
        Map<Boolean, List<Integer>> l1 = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(e -> (int) e >= 0));
    }
}
