package org.example;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    int num = 10;

    public void display() {
        int num = 12;
        Runnable r = new Runnable() {
            final int num = 15;

            @Override
            public void run() {
                int num = 20;
                System.out.println(this.num);
            }
        };
        r.run();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        App a = new App();
        System.out.println(a.num);
        a.display();

       /* Boeing bo=new Boeing();
        //bo.test1();
        bo.test2();*/
        //Capgemini cap=new Capgemini();
        //cap.test1();
       // Zenzar zen=new Zenzar();
       // zen.task();

        //MapQuestions mapQ=new MapQuestions();
        // mapQ.mapquestions();
        // mapQ.shortbyKeyValue();
        //Presist p = new Presist();
        //p.find2ndlarge();
        //  p.merge2list();
        //p.findnValue();
        // Optimum opt=new Optimum();
        // Coforge co=new Coforge();
        Dummy du = new Dummy();
        //du.mulitpleofno();
        //du.test();
        du.getEmployee();
        //du.method1();
        // du.sumFirstDigit2();
        //du.removeDuplicate();
        //du.getEmployee();
        //du.mulitpleofno();
        //du.reverseString();
        // du.method2();
        // D4You d4u = new D4You();
        //d4u.method1();

        //
        // co.method1();
        //opt.method1();
        //basicstream();
        //reversString();
        // callQue();
        // priorityQueue();
        // circulerQueue();
        // numstartwith1(); // Filter numbers starting with 1

       // AccionLab acc= new AccionLab();
       // acc.task();

    }


    public void capgemini(){

    }


    private static void basicstream() {

        int[] arr = {10, 92, 45, 34, 5, 74, 232, 546, 327, 79, 4, 64, 3, 5, 724, 5, 6, 76, 897, 8, 230, 50, 25, 2, 34, 6, 45, 6, 54, 77, 8, 78, 97, 4, 35, 353};
        String[] teststr = {"5", "10"};
        Arrays.sort(teststr, (s1, s2) -> s1.length() - s2.length());
        System.out.println("Test Str[0] :: " + teststr[0]);
        System.out.println("Test Str[1] :: " + teststr[1]);
        List<Integer> l1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> shortl1 = l1.stream().sorted().collect(Collectors.toList());

        shortl1.stream().forEach(i -> System.out.print(" " + i));
        System.out.println("\n #### With Comparator #### ");

        shortl1 = l1.stream().sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
        shortl1.stream().forEach(i -> System.out.print(" " + i));

        int maxval = l1.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println("\n Maximum Value of array :: " + maxval);
        String s1 = "$#$##$#$#$#@@!#@()KSBDBAJSDAbiqu2983y2381398q*&y*&*&z"; // “@(*#(@#(*#(#*@#KSBDBAJSDAbiqu2983y2381398q*&y*&*&z”;
        String filterStr = s1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Filtered String :: " + filterStr);

    }

    private static void removeDuplicate() {

    }

    private static void reversString() {
        String str = "Antony";
        String revstr = str.chars().mapToObj(ch -> (char) ch)
                .reduce("", (c, s) -> c + s, (s1, s2) -> s1 + s2);
        System.out.println("Reverse String :: " + revstr);
        char[] ch = {'G', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'G', 'e', 'e', 'k', 's'};

        // Converting character array into string
        // using joining() method of Collectors class
        String chString = Stream.of(ch)
                .map(arr -> new String(arr))
                .collect(Collectors.joining());

        // Printing concatenated string
        System.out.println(chString);


        String revstream = Stream.of(str)
                .map(input -> new StringBuilder(input).reverse())
                .collect(Collectors.joining());
        System.out.println("Reverse String :: " + revstream);
    }

    private static void numstartwith1() {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 105);
        //Function<Integer,Integer> func= n->(int)Math.log10(n);
        //int n=888;
        //int base=(int)Math.log10(n);
        // int val = n/(int)Math.floor((Math.pow(10,base)));
        //  System.out.println("Base 10 Value of 15 :: "+base);
        //  System.out.println("Power 10 of Base :: "+ val);
        int total = list.stream().
                filter(n -> (n == 1 || (int) Math.log10(n) > 0 && n / (int) Math.floor(Math.pow(10, (int) Math.log10(n))) == 1))
                .mapToInt(i -> i).sum();
        //.forEach(System.out::println);
        // .collect(Collectors.toList());
        System.out.println("Sum of numbers start with 1 :: " + total);
    }

    private static void circulerQueue() {
        System.out.println("\n" + "The CircularQueue");
        CirQueue cque = new CirQueue();
        cque.enQue(7);
        cque.enQue(8);
        cque.enQue(9);
        cque.enQue(10);
        cque.enQue(11);
        System.out.println("\n" + "The Display CircularQueue Data");
        cque.disQue();

    }


    private static void priorityQueue() {
        Queue<Integer> pQueue
                = new PriorityQueue<Integer>();

        // Adding items to the pQueue
        // using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(15);
        pQueue.add(11);
        pQueue.add(70);
        pQueue.add(85);
        pQueue.add(145);
        // Printing the top element of
        // the PriorityQueue
        System.out.println("\n" + "The PriorityQueue");
        pQueue.stream().forEach(pq -> System.out.print(" " + pq));

        System.out.println("\n" + pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println("\n pQueue.poll :: " + pQueue.poll());
        pQueue.stream().forEach(pq -> System.out.print(" " + pq));
        // Printing the top element again
        System.out.println("\n pQueue.peek :: " + pQueue.peek());

        System.out.println("\n pQueue.peek :: " + pQueue.peek());

        System.out.println("\n pQueue.poll :: " + pQueue.poll());
        pQueue.stream().forEach(pq -> System.out.print(" " + pq));
        System.out.println("\n pQueue.poll :: " + pQueue.poll());
        pQueue.stream().forEach(pq -> System.out.print(" " + pq));
    }

    private static void callQue() {

        //int[] que= {7,5,9,3,1,4,5,3,2};
        Queue<Integer> que = new LinkedList<>();
        que.add(7);
        que.add(5);
        que.add(9);
        que.add(3);
        que.add(1);
        que.add(4);
        que.add(5);
        que.add(3);
        que.add(2);

        System.out.println("\n #### callQue #### ");
        que.stream().forEach(q -> System.out.print(" " + q));
        System.out.println("\n Peek :: " + que.peek());
        que.stream().forEach(q -> System.out.print(" " + q));
        System.out.println("\n Pool :: " + que.poll());

        que.stream().forEach(q -> System.out.print(" " + q));


    }
}
