

package LinkedList;

import java.util.HashSet;

class Node{
    int data;
    Node next;

    public Node(int x){
        this.data=x;
        // this.next=null;

    }
}

public class detectLoop {
    //detecting loop using hashing (extra space O(n))
    static Boolean fingLoop(Node head){
        HashSet<Node> hs=new HashSet<Node>();
        for(Node current=head; current!=null;current=current.next){
            if(hs.contains(current)){
                return true;
            }
            hs.add(current);
        }
        return false;

    }
    //detect loop using Floyd's algorithm
    static Boolean find(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    //function to detect the loop and delete the loop
    static void detectAndRemove(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
               break;
            }
        }
        if(slow!=fast){
            return;
        }
        slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
     //function to print traverse the linked list and print the data
     static void printLinkedList(Node head){
        Node current=head;
        while(current != null){
            System.out.println(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(20);
        Node temp1=new Node(30);
        Node temp3=new Node(40);
        Node temp4=new Node(59);
        Node temp5=new Node(100);
        head.next=temp1;
        temp1.next=temp3;
        temp3.next=temp4;
        temp4.next=temp5;
        temp5.next=temp3;

       // System.out.println("The given linked list contains loop ="+fingLoop(head));
       //System.out.println("The given linked list contains loop ="+find(head));
       System.out.println("This is the linked list after removal of loop");
       detectAndRemove(head);
       printLinkedList(head);
        
    }
    
}
