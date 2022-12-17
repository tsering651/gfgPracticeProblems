
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
    //preorder traversal of a tree(root left right)
    static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.key+ " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    //postOrder traversal of a tree (left right root)
    static void postOrder(Node root){
        if(root!=null){
           
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key+ " ");
        }
    }
    //height of the binary tree
    static int height(Node root){
        if(root==null){
            return 0;
        }
        else{
            return Math.max(height(root.left), height(root.right))+1;
        }
    }
    //function to print the nodes that are at a distance k from the root node
    static void printKNode(Node root ,int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.print(root.key+ " ");

        }
        else{
            printKNode(root.left, k-1);
            printKNode(root.right, k-1);
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
        System.out.println();
        System.out.println("Preoder traversal");
        preOrder(root);
        System.out.println();
        System.out.println("PostOrder traversal");
        postOrder(root);
        System.out.println();
        System.out.println("Height of the binary tree is "+ height(root));
        printKNode(root, 2);
    }
    
}
