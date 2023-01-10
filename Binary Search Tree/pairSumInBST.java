import java.util.HashSet;

class Node{
    int key;
    Node left;
    Node right;
    public Node(int data){
        this.key=data;
    }
}


public class pairSumInBST {

    //function to find the pairs with the given sum if exits or not
    static boolean hasPair(Node root,int sum ,HashSet<Integer> hs){
             //we will do a inorder traversal and for every node we will check following
             // sum-node.data contain in the hashset or not 
             //if yes return true else put Node.data in the hashset
             if(root==null){
                return false;
             }
             if(hasPair(root.left, sum, hs)==true){
                return true;
             }
             if(hs.contains(sum-root.key)){
                return true;
             }
             else{
                hs.add(root.key);
             }
             return hasPair(root.right, sum, hs);
    }

    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(70);
        root.left.left=new Node(25);
        root.right.right=new Node(0);
        root.left.right=new Node(40);
        root.right.left=new Node(60);
        int sum=75;
        HashSet<Integer> hs=new HashSet<>();
        System.out.println(hasPair(root, sum, hs));
    }
    
}
