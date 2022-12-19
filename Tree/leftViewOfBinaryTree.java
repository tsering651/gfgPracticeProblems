import java.util.LinkedList;
import java.util.Queue;

class Node{
    int key;
    Node left;
    Node right;
    //constructor
    public Node(int x){
        this.key=x;
    }

}

public class leftViewOfBinaryTree {

    //function to print the lefmost node on every level from a binary tree
    static void leftView(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
         while(q.isEmpty()==false){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.remove();
                if(i==0){
                    System.out.print(curr.key+" ");

                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }

            }
         }
        
    }
    public static void main(String[] args) {
        Node root=new Node(29);
        root.left=new Node(34);
        root.right=new Node(40);
        root.left.left=new Node(12);
        root.left.right=new Node(59);
        root.right.right=new Node(90);
        leftView(root);
    }
    
}
