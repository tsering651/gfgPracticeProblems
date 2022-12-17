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

public class levelOrderTraversal {

    //function for level order traversal using queue data structure 
    static void levelOrder(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while ( q.isEmpty()==false) {
            Node curr=q.remove();
            System.out.print(curr.key +" ");
            if(curr.left !=null){
                q.add(curr.left);
            }
            if(curr.right !=null){
                q.add(curr.right);
            }
            
        }
    }
   public static void main(String[] args){
    Node root=new Node(29);
    root.left=new Node(34);
    root.right=new Node(40);
    root.left.left=new Node(12);
    root.left.right=new Node(59);
    root.right.right=new Node(90);
    levelOrder(root);
   }
    
}
