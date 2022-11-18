package LinkedList;


class Node{
    int data;
    Node next;

    public Node(int x){
        this.data=x;
        // this.next=null;

    }
}

public class basicOperations {
    public static void main(String[] args) {
        Node head=new Node(20);
        Node temp1=new Node(30);
        Node temp3=new Node(40);
        Node temp4=new Node(59);
        head.next=temp1;
        temp1.next=temp3;
        temp3.next=temp4;
    //    System.out.println(addNodeAtFirst(head, 90));
        Node result=deleteNodeFromFirst(head);
        System.out.println("this is the new head "+ result.data);
        System.out.println("The position of the given data is "+searchKey(head, 40));
        
        printLinkedList(head);
    }

    //function to print traverse the linked list and print the data
    static void printLinkedList(Node head){
        Node current=head;
        while(current != null){
            System.out.println(current.data+" ");
            current=current.next;
        }
    }

    //function to insert a node at the begining and return the head
    static Node addNodeAtFirst(Node head,int data){
             Node temp=new Node(data);
             temp.next=head;
             return head;

    }
    //function to insert at the end  and return the head
    static Node addNodeAtLast(Node head,int data){
        Node temp=new Node(data);
        if(head==null){
            return temp;
        }
        Node current=head;
        while(current.next !=null){
            current=current.next;
        }
        current.next=temp;
        return head;
    }
    //function to delete the node from the begining and return the new head
    static Node deleteNodeFromFirst(Node head){
        if(head==null){
            return null;
        }
        return head.next;
    }
    //function to delete a node from the end and returning the head
    static Node deleteNode(Node head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node current=head;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;

        return head;
    }
    //function to insert at any given position in a singly liked list
    static Node insertAtAnyPosition(Node head,int position,int data){
        Node temp=new Node(data);

        if(position==1){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        for(int i=1;i<=position-2 &&curr!=null;i++){
               curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;

        return head;


    }
    //search an key in the linked list and return its position
    static int searchKey(Node head,int key){
      
        Node current=head;
        int position=1;
        while(current!=null){
            if(current.data==key){
                return position;
            }
            else{
                current=current.next;
                position++;
            }
        }
        return -1;
    }
    
}
