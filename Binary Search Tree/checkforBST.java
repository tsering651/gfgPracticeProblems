class Node{
    int key;
    Node left;
    Node right;
    public Node(int data){
        this.key=data;
    }
}



public class checkforBST {

    //function to check whether the given binary tree is a BST
    static boolean isBST(Node root,int min,int max){
        if(root==null){
            return true;
        }
        return (root.key>min && root.key<max && isBST(root.left, min, root.key)&& isBST(root.right, root.key, max));
    }
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(70);
        root.left.left=new Node(25);
        root.right.right=new Node(0);
        root.left.right=new Node(40);
        root.right.left=new Node(60);
        System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
    
}
