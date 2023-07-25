package org.example;

import java.util.HashSet;
import java.util.Set;

public class D4You {
    public  void method1(){

        Egg e1=new Egg();
        Egg e2=null;
        Egg e3=null;

        Set<Egg> eggSet=new HashSet<>();
        eggSet.add(e1);
        eggSet.add(e2);
        eggSet.add(e2);
        System.out.println("eggset Size :: "+ eggSet.size());

    }


}
