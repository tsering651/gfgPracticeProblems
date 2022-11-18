package LinkedList;


class Node{
    int data;
    Node next;

    public Node(int x){
        this.data=x;
        // this.next=null;

    }
}
public class findMiddleNode {
    //function to print the middle Node using two references
    static void findMiddle(Node head){
        if(head==null){
            return;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("The middle element is "+slow.data);
    }
    public static void main(String[] args) {
        Node head=new Node(20);
        Node temp1=new Node(30);
        Node temp3=new Node(40);
        Node temp4=new Node(59);
        head.next=temp1;
        temp1.next=temp3;
        temp3.next=temp4;
        findMiddle(head);
    }
    
}
