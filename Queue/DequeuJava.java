package Queue;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeuJava {
    public static void main(String[] args) {
        //initializing and Deque--->Deque is a data structure where we can do insertion and deletion from both ends
        Deque<Integer> d=new LinkedList<Integer>();
        d.addFirst(10);
        d.addFirst(20);
        d.addLast(30);
        d.addLast(90);
        System.out.println(d);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        d.removeFirst();
        Iterator it=d.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }
    
} 
