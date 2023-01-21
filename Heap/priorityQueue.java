package Heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class priorityQueue {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // PriorityQueue<Integer> p=new PriorityQueue<>();
        PriorityQueue<Integer> p = new PriorityQueue<Integer>(
                Collections.reverseOrder());
        p.add(12);
        p.add(1);
        p.add(13);
        System.out.println(p.peek());
        System.out.println(p.poll());
        System.out.println(p.peek());

    }

}
