import java.util.Queue;
import java.util.LinkedList;


class Node{
    int key;
    Node left;
    Node right;
    //constructor
    public Node(int x){
        this.key=x;
    }

}
public class widthOfBinaryTree {

    //function to print the maximum number of nodes at a certain level
    static int maxWidth(Node root){
        if(root==null){
            return 0;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        int res=0;
        while(q.isEmpty()==false){
            int size=q.size();
            res=Math.max(size,res);
            for(int i=0;i<size;i++){
                Node curr=q.remove();
                if(curr.left!=null){
                    q.add(curr.left);

                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return res;


    }
    public static void main(String[] args) {
        Node root=new Node(29);
        root.left=new Node(34);
        root.right=new Node(40);
        root.left.left=new Node(12);
        root.left.right=new Node(59);
        root.right.right=new Node(90);
        System.out.println("The maximum width of the given tree is "+ maxWidth(root));
    }
    
}
