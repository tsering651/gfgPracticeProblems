

class Node{
    int key;
    Node left;
    Node right;
    //constructor
    public Node(int x){
        this.key=x;
    }

}



public class leastCommonAncestor {
    //function to find the least common ancestor of given two nodes
    static Node lca(Node root,int n1,int n2){
        if(root==null){
            return null;
        }
        if(root.key ==n1 || root.key==n2){
            return root;
        }
        Node left=lca(root.left,n1,n2);
        Node right=lca(root.right,n1,n2);

        if(left !=null && right !=null){
            return root;
        }
        if(left!=null){
            return left;
        }
        else{
            return right;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(20);
        root.left=new Node(8);
        root.right=new Node(12);
        root.left.left=new Node(3);
       root.left.right=new Node(5);
       System.out.println("The common ancestor of the given two nodes is "+ lca(root, 3, 5).key);
    }
    
}
