class Node{
    int key;
    Node left;
    Node right;
    public Node(int data){
        this.key=data;
    }
}


public class insertInBST {
    //recursive function to insert a new node and return the root of the new bst
    //the bst root only changes when we are given an empty bst
    static Node insert(Node root,int x){
        if(root==null){
            return new Node(x);
        }
        else if(root.key>x){
            root.left=insert(root.left,x);
        }
        else if(root.key<x){
            root.right=insert(root.right,x);
        }
        return root;
    }
    //iterative approach

    static Node insert2(Node root,int x){
         Node temp=new Node(x);
         Node curr=root;
         Node parent=null;
         while(curr!=null){
            parent=curr;
            if(curr.key>x){
                curr=curr.left;
            }
            else if(curr.key<x){
                curr=curr.right;
            }
            else{
                return root;
            }

         }
         if(parent==null){
            return temp;
         }
         else if(parent.key>x){
            parent.right=temp;
         }
         else{
            parent.left=temp;
         }
         return root;
    }

    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(70);
        root.left.left=new Node(25);
        root.right.right=new Node(80);
        root.left.right=new Node(40);
        root.right.left=new Node(60);
        
        System.out.println(insert(root, 90).key);
        System.out.println(insert2(root, 90).key);
    }
    
}
