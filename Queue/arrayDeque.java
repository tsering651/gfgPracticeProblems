package Queue;

import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        //arrayDeque can be used to implement Stack ,Queue,Deque 

        //arrayDeque used as Deque
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.addFirst(23);
        ad.addLast(26);
        ad.addFirst(34);
        ad.addLast(80);
        System.out.println(ad);
    }
    
}
