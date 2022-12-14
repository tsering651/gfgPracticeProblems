package Queue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reversingQueue {

    //function to reverse and queue
    static void reverse(Queue<Integer> q){
          Stack<Integer> st=new Stack<>();
          while(q.isEmpty()==false){
               st.push(q.remove());
          }
          while(st.isEmpty()==false){
            q.add(st.pop());
          }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(20);
        q.add(3);
        q.add(34);
        q.add(12);
        System.out.println("Before reversing the Queue "+ q);
        reverse(q);
        System.out.println("After reversing the Queue "+ q);

    }
    
}
