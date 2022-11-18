package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int x){
        this.data=x;
        // this.next=null;

    }
}
public class findNthNodeFromEnd {
    //function to find the nth node from end by finding the length
    static void findNth(Node head,int n){
        int length=0;
        for(Node curr=head;curr!=null;curr=curr.next){
            length++;
        }
        if(length<n){
            return;

        }
        Node current=head;
        for(int i=1;i<length-n+1;i++){
            current=current.next;
        }
        System.out.println("The nth node from the end is "+current.data);
    }

    public static void main(String[] args) {
        Node head=new Node(20);
        Node temp1=new Node(30);
        Node temp3=new Node(40);
        Node temp4=new Node(59);
        head.next=temp1;
        temp1.next=temp3;
        temp3.next=temp4;
        findNth(head, 2);
    }
    
}
