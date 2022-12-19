
class Node{
    int key;
    Node left;
    Node right;
    //constructor
    public Node(int x){
        this.key=x;
    }

}



public class childrenSum {
    //function to check the sum of the left child and the right child is equal to the parent child
    static Boolean isEqual(Node root){
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        int sum=0;
        if(root.left!=null){
           sum+=root.left.key;
        }
        if(root.right!=null){
            sum+=root.right.key;
        }
        return (root.key==sum && isEqual(root.left)&& isEqual(root.right));
    }
    public static void main(String[] args) {
        Node root=new Node(20);
        root.left=new Node(8);
        root.right=new Node(12);
        root.left.left=new Node(3);
       root.left.right=new Node(5);
       // root.right.right=new Node(70);
        System.out.println(isEqual(root));
    }
    
}
