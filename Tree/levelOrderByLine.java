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
public class levelOrderByLine {

    //level order traversal by line
    static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size()>1){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
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
        levelOrder(root);
    }
    
}
