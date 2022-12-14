
class Node{
    int key;
    Node left;
    Node right;
    //constructor
    public Node(int x){
        this.key=x;
    }

}

public class inOrderTraversal {

    //inorder traversal of a tree (left root right)
    static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.key +" ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root=new Node(29);
        root.left=new Node(34);
        root.right=new Node(40);
        root.left.left=new Node(12);
        root.left.right=new Node(59);
        root.right.right=new Node(90);
        inOrder(root);
    }
    
}
