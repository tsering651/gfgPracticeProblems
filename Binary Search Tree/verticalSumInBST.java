import java.util.Map;
import java.util.TreeMap;

class Node{
    int key;
    Node left;
    Node right;
    public Node(int data){
        this.key=data;
    }
}


public class verticalSumInBST {

    //function to add the horizontal distance in the treemap using inorder traversal
    static void vsum(Node root,int hd,TreeMap<Integer,Integer> mp){
        if(root==null){
            return;
        }
        vsum(root.left, hd-1, mp);
        int prev=(mp.get(hd)==null ? 0 :mp.get(hd));
        mp.put(hd, root.key+prev);
        vsum(root.right, hd+1, mp);
    }
    //function to print the treemap'
    static void printTree(Node root){
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        vsum(root, 0, mp);

        for(Map.Entry<Integer,Integer> m:mp.entrySet()){
               System.out.print(m.getValue()+" ");
        }
    }
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(70);
        root.left.left=new Node(25);
        root.right.right=new Node(0);
        root.left.right=new Node(40);
        root.right.left=new Node(60);
        printTree(root);
    }
}
