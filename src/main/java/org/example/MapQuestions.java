package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapQuestions {

    public void mapquestions(){
        Map<String,String> book=new HashMap<>();
        book.put("001","Tamil");
        book.put("002","English");
        book.put("003","Math");
        book.put("004","Java");
        book.put("005","Python");
        book.put("006","Math");
        book.put("007","Tamil");
        book.put("008","English");
        book.put("009","Math");
        book.put("010","Java");
        book.put("011","Tamil");
        book.put("012","English");
        book.put("013","Math");
        book.put("014","Java");
        book.put("015","Python");
        book.put("016","Math");
        book.put("017","Tamil");
        book.put("018","English");
        book.put("019","Math");
        book.put("020","Java");
        book.put("021","Tamil");
        book.put("022","English");
        book.put("023","Math");
        book.put("024","Java");
        book.put("025","Python");
        book.put("026","Math");
        book.put("027","Tamil");
        book.put("028","English");
        book.put("029","Science");
        book.put("030","Java");
        book.put("031","Tamil");
        book.put("032","English");
        book.put("033","Math");
        book.put("034","Java");
        book.put("035","network");
        book.put("036","Math");
        book.put("037","Tamil");
        book.put("038","English");
        book.put("039","Math");
        book.put("040","Java");

        getkeybyValue(book);
        shortbyKeyValue();
    }
    public void getkeybyValue(Map<String, String> bookmap) {
        String value="Java";
       Set<String> filterdkeylist= bookmap.keySet()
                .stream().filter(key -> Objects.equals(bookmap.get(key),value))
                .collect(Collectors.toSet());
       filterdkeylist.stream().forEach(System.out::println);

       //Arrays.
    }
    public void shortbyKeyValue(){
        int arr[] = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
       List<Integer> l1 = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Map<Integer,Long> groupMap= l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //Map<Integer,Long>sortedMap=groupMap.entrySet().stream().sorted(Map.Entry.<Integer,Long>comparingByKey()
        Map<Integer,Long> sortedMap=groupMap.entrySet().stream().sorted(Map.Entry.<Integer,Long>comparingByValue().reversed())
                //.thenComparing(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldval,newval)->oldval,LinkedHashMap::new));
        //List <Map.Entry<Integer, Long>> sortedentry = (List<Map.Entry<Integer, Long>>) sortedMap.entrySet();
        List <Map.Entry<Integer, Long>> sortedentry = new LinkedList<>(sortedMap.entrySet());
        /*List <Map.Entry<Integer, Long>> splitentry  =sortedentry.stream()
                .collect(Collectors.partitioningBy(sortedMap.values())
               .get(1).stream().sorted(Map.Entry.<Integer,Long>comparingByKey()).collect(Collectors.toList());*/
       // Map<Integer,Long> keysortedMap=splitentry.stream()
                //.filter(entry->Objects.equals(sortedMap.get(entry.getKey()),entry.getValue())).sorted(Map.Entry.<Integer,Long>comparingByKey())
                //.collect(Collectors.toList()).stream()
                 //       .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldval,newval)->oldval,LinkedHashMap::new));

        System.out.println("Sorted Map"+ sortedMap);
      //  System.out.println("Sorted Map"+ keysortedMap);


    }

}
