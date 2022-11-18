package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int x){
        this.data=x;
        // this.next=null;

    }
}
public class reverseLinkedList {
    //function to reverse a linked list and return new head
    static Node reverse(Node head){
        Node current=head;
        Node previous=null;
        while(current!=null){
            Node next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;

    }

    public static void main(String[] args) {
         Node head=new Node(20);
        Node temp1=new Node(30);
        Node temp3=new Node(40);
        Node temp4=new Node(59);
        head.next=temp1;
        temp1.next=temp3;
        temp3.next=temp4;
        System.out.println("tHE NEW HEAD AFTER REVERSING IS "+ reverse(head).data);
    }
    
}
