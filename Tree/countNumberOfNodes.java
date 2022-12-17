
class Node{
    int key;
    Node left;
    Node right;
    //constructor
    public Node(int x){
        this.key=x;
    }

}


public class countNumberOfNodes {

    //function to count number of nodes in the tree
    static int noOfNodes(Node root){
        if(root==null){
            return 0;
        }
        else{
            return 1+ noOfNodes(root.left)+noOfNodes(root.right);
        }
    }
    //function to get the maximum value node in the tree
    static int getMax(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        else{
            return Math.max(root.key,Math.max(getMax(root.left),getMax(root.right)));
        }
    }
    public static void main(String[] args) {
        Node root=new Node(29);
        root.left=new Node(34);
        root.right=new Node(40);
        root.left.left=new Node(12);
        root.left.right=new Node(59);
        root.right.right=new Node(90);
        System.out.println("Number of nodes int the tree is "+ noOfNodes(root));
        System.out.println("The maximum value node is "+ getMax(root));
    }
    
}
