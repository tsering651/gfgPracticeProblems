package LinkedList;
class Node{
    int data;
    Node next;

    public Node(int x){
        this.data=x;
        // this.next=null;

    }
}

public class segregateEvenOdd {
    //function to segregate even and odd nodes
    static Node segregate(Node head){
        Node es=null ,ee=null, os=null,oe=null;
        int x;
        for(Node curr=head;curr!=null;curr=curr.next){
            x=curr.data;
            if(x%2==0){
                if(es==null){
                    es=curr;
                    ee=curr;
                }
                else{
                    ee.next=curr;
                    ee=ee.next;
                }
            }
            else{
                if(os==null){
                    os=curr;
                    oe=curr;
                }
                else{
                    oe.next=curr;
                    oe=oe.next;
                }
            }
        }
        if(os==null ||es==null){
            return head;
        }
        ee.next=os;
        oe.next=null;
        return es;
    }
    public static void main(String[] args) {
        Node head=new Node(20);
        Node temp1=new Node(33);
        Node temp3=new Node(40);
        Node temp4=new Node(59);
        Node temp5=new Node(100);
        System.out.println("new head "+segregate(head).data);
    }
    
}
