package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CirQueue {
    int size=5;
    int front, rear;
    int que[]=new int[size];
    CirQueue(){
        front=-1;
        rear=-1;
    }
    public void enQue(int val){
        if(isQueFull()){
            System.out.println("Sorry Queue is full");
        }
        else{
            if(front==-1)
                front=0;
            rear=(rear+1) % size;
            que[rear]=val;
            System.out.println("Element " + val + " is inserted successfully");
            System.out.println("Front :: "+ front);
            System.out.println("Rear :: "+ rear);
            System.out.println("Queue Size :: "+ que.length);
        }
    }

    private boolean isQueFull() {
        if(front==0 && rear== size -1){
            return  true;
        }
        return false;
    }

    public void disQue(){
        front=2;
        rear=1;
        List<Integer> l1= Arrays.stream(que).boxed().collect(Collectors.toList());
        l1.stream().forEach(i -> System.out.print(" "+i));
        System.out.println("\n Display Queue with condition. ");
        int i;
        for ( i=front;i!=rear;i=(i+1)%size){
            System.out.println("Que["+i+"] :"+que[i]);
        }
        System.out.println("Que["+i+"] :"+que[i]);
    }
}
