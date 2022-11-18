package LinkedList;


class Node{
    int data;
    Node next;

    public Node(int x){
        this.data=x;
        // this.next=null;

    }
}
public class removeDuplicates {
    //function to remove duplicates
    static void removeDup(Node head){
        Node current=head;
        if(current==null){
            return;
        }
        while(current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
    }
    static void printLinkedList(Node head){
        Node current=head;
        while(current != null){
            System.out.println(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(20);
        Node temp1=new Node(20);
        Node temp3=new Node(40);
        Node temp4=new Node(59);
        head.next=temp1;
        temp1.next=temp3;
        temp3.next=temp4;
        removeDup(head);
        printLinkedList(head);
    }
    
}
