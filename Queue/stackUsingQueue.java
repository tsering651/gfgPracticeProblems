package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

class Stack{
    static Queue<Integer> q1=new ArrayDeque<>();
    static Queue<Integer> q2=new ArrayDeque<>();

    //function peek()
    static int peek(){
        return q1.peek();
    }
    //pop()
    static int pop(){
        int curr=q1.peek();
        q1.remove();
        return curr;
    }
    //push
    static void push(int x){
        while(q1.isEmpty()==false){
            q2.add(q1.remove());
        }
        q1.add(x);
        while(q2.isEmpty()==false){
            q1.add(q2.remove());
        }
    }
    

}
public class stackUsingQueue {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(2);
        st.push(4);
        st.push(90);
        st.push(78);
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
    
}
