class Node{
    int key;
    Node left;
    Node right;
    public Node(int data){
        this.key=data;
    }
}



public class deleteInBst {
    //function to delete a given node in bst and return the root
    static Node deleteNode(Node root,int x){
        if(root==null) {
            return null;
        }
        else if(root.key <x){
            root.right=deleteNode(root.right, x);
        }
        else if(root.key >x){
            root.left=deleteNode(root.left, x);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            else{
                Node succ=findSuccessor(root);
                root.key=succ.key;
                root.right=deleteNode(root.right, succ.key);
            }
            
        }
        return root;
    }
    static Node findSuccessor(Node root){
        Node curr=root.right;
        while(curr !=null && curr.left!=null){
            curr=curr.left;
        }
        return curr;
    }
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(70);
        root.left.left=new Node(25);
        root.right.right=new Node(80);
        root.left.right=new Node(40);
        root.right.left=new Node(60);
        System.out.println(deleteNode(root, 50).key);
    }
    
}
