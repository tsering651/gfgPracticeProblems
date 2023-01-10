class Node{
    int key;
    Node left;
    Node right;
    public Node(int data){
        this.key=data;
    }
}

public class floorInBST {
    //function to find the floor of a given number in the bst
    static Node floor(Node root,int x){
        Node res=null;
        while(root!=null){
            if(root.key==x){
                return root;
            }
            else if(root.key>x){
                root=root.left;
            }
            else{
                res=root;
                root=root.right;
            }
        }
        return res;
    }
     //function to find the ceiling of a given number in the bst
     static Node ceiling(Node root,int x){
        Node res=null;
        while(root!=null){
            if(root.key==x){
                return root;
            }
            else if(root.key>x){
                res=root;
                root=root.left;
            }
            else{
                
                root=root.right;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(70);
        root.left.left=new Node(25);
        root.right.right=new Node(80);
        root.left.right=new Node(40);
        root.right.left=new Node(60);
        System.out.println(floor(root, 45).key);
        System.out.println(ceiling(root, 45).key);
    }
    
}
