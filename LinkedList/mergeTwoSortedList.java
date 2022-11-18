package LinkedList;


class Node{
    int data;
    Node next;

    public Node(int x){
        this.data=x;
        // this.next=null;

    }
}
public class mergeTwoSortedList {
    //function to merge two sorted list and return the head of the list
    /**
     * @param a
     * @param b
     * @return
     */
    static Node merge(Node a,Node b){
        if(a==null){
            return b;
        }
        else{
            return a;
        }
        Node head1 = null;

        Node tail=null;
        if(a.data<=b.data){
            head1=a;
            tail=a;
            a=a.next;
        }
        else{
            head1=b;
            tail=b;
            b=b.next;
        }
        while(a!=null && b!=null){
            if(a.data<=b.data){
                tail.next=a;
                tail=a;
                a=a.next;
            }
            else{
                tail.next=b;
                tail=b;
                b=b.next;
            }
        }
        if(a==null){
            tail.next=b;
        }
        else{
            tail.next=a;
        }
        return head1;
        }
 public static void main(String[] args) {
    // Node head=new Node(20);
    // Node temp1=new Node(30);
    // Node temp3=new Node(40);
    // Node temp4=new Node(59);
    // head.next=temp1;
    // temp1.next=temp3;
    // temp3.next=temp4;
 }
    
}
