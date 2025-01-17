package day41_collection.quene;

import java.util.PriorityQueue;

public class QueneObjects {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();// Insertion order is NOT KEPT (RANDOM ORDER), does NOT allow null
        priorityQueue.add(2);
        priorityQueue.add(10);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(2);//DUPLICATES
       // priorityQueue.add(null);   null is now allowed//NullPointerException
        System.out.println(priorityQueue);

        priorityQueue.offer(30);
        System.out.println(priorityQueue);


        priorityQueue.offer(1);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue);

        System.out.println();

        priorityQueue.poll();   // FIFO -- > First in First Out -- > first one was removed
        System.out.println(priorityQueue);
        priorityQueue.poll();   // FIFO -- > First in First Out -- > first one was removed
        System.out.println(priorityQueue);





    }
}
