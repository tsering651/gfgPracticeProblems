package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class operationsOnQueue {

    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<Integer>();
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(20);
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.isEmpty());
    }
    
}
