
class Node{
    int data;
    Node next;
    public Node(int d){
        data=d;
    }
}



public class printMiddleInLinkedList {
    //program to find the middle element in the linked liost
    static int findMiddle(Node head){
        if(head==null){
            return 0;
        }
        Node p1=head;
        Node p2=head;
        while(p1!=null && p2!=null){

        
        if(p2.next==null || p2.next.next==null){
            return p1.data;
        }
        p1=p1.next;
        p2=p2.next.next;

        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={20,40,10,30,70};
        Node head=new Node(arr[0]);;
        Node res=head;
        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
             res.next=newNode;
             res=res.next;
        }
        System.out.println("Middle lement is "+ findMiddle(head));

    }
    
}
