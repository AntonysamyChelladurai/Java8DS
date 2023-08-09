package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Presist {
    public void find2ndlarge(){

        int[] arr={5, 9, 5, 2, 8, 9, 1};
       /* List<Integer> l1=Arrays.stream(arr).boxed().collect(Collectors.toList());
        Map<Integer, Long> temp=l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Set<Integer> filter= temp.keySet();
        Stream<Integer> second=filter.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).limit(2).skip(1);
                second.forEach(System.out::print);*/
       // Arrays.stream(arr).sorted(Comparator.comparing(Integer::intValue).reversed().
        int x=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
        System.out.println("X ::"+x);
    }

    public void merge2list(){
        int[] arrayA = new int[] {7, -5, 3, 8, -4, 11, -19, 21};

        int[] arrayB = new int[] {6, 13, -7, 0, 11, -4, 3, -5};
        System.out.println(" Merge List ");

        Set<Integer> s1= Arrays.stream(arrayA).boxed().collect(Collectors.toSet());
                //.forEach()
               boolean flag= s1.stream().collect(Collectors.toSet()).addAll(Arrays.stream(arrayB).boxed().collect(Collectors.toSet()));
               s1.stream().forEach(System.out::println);
    }

/*[14:05] Vidya Khedkar

    Find nearest elements to a given element by +/- 10%

    Input: [100, 104, 121, 80, 99, 60, 90, 85, 130, 110, 125, 96, 72,]

    given element k = 100*/
    public void findnValue(){

        int k=100;

        int[] input={100, 104, 121, 80, 99, 60, 90, 85, 130, 110, 125, 96, 72};

        int pvalue=Math.abs((k*10)/100+k);
        int nvalue=Math.abs(((k*10)/100)-k);
        Integer pv = Arrays.stream(input).filter(e->e==pvalue).findAny().getAsInt();
        Integer nv = Arrays.stream(input).filter(e->e==nvalue).findAny().getAsInt();
        System.out.println("+ve :: "+pv+"  -ve :: "+nv);

        //int pvalue=((k*10)/100)+k;
      //List<Integer> shorted= Arrays.stream(input).boxed().sorted(Comparator.comparing(Integer::byteValue))
      //         .collect(Collectors.toList());


       //int listsize=shorted.size();
       /*if(k>=shorted.get(listsize))
       {
           System.out.println("  not in the list");
       }*/
       // int pvalue=Math.abs((k*10)/100+k);
      //  int nvalue=Math.abs(((k*10)/100)-k);
      // int i=0;
      // shorted.stream().anyMatch(e->e==pvalue);
      //  Integer pv = shorted.stream().filter(e -> e == pvalue).findAny().get();
       // Integer nv = shorted.stream().filter(e -> e == nvalue).findAny().get();
       // System.out.println("+ve :: "+pv+"  -ve :: "+nv);
       //shorted.stream().findFirst(pvalue).get();
       //shorted.stream().findFirst(pvalue).get();
      // binarySearch(shorted,listsize,k,i);


    }

    /*private void binarySearch(List<Integer> shorted, int listsize, int k, int i) {
        int mid=i+listsize/2;

        if(pvalue==shorted.get(mid))
        {
            System.out.println("+10 % :: "+shorted.get(mid));
            System.out.println("-10 % :: "+shorted.get(mid-1));
        }
        else if(nvalue<=shorted.get(mid) && pvalue>=shorted.get(mid)){
            i=mid;
            binarySearch(shorted,listsize,k,i);
        }


    }*/


}
