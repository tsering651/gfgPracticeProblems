package LinkedList;

import java.util.HashMap;

class Node {
    int data;
    Node next;
    Node previous;
    public Node(int data){
        this.data=data;
    }
}
public class cache {

    //function to maintain LRU cache
    static void lruCache(Node head){
        int cacheSize=4;
        HashMap<Integer,Node> hs=new HashMap<>();
        for (Node curr=head;curr!=null;curr=curr.next){
            if(hs.containsKey(curr.data)){
                
            }
        }
        
    }
    public static void main(String[] args) {
        
    }
    
}
