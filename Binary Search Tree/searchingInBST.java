
class Node{
    int key;
    Node left;
    Node right;
    public Node(int data){
        this.key=data;
    }
}




public class searchingInBST {

    //function to search a element in the binary tree recursively
    static boolean search(Node root,int x){
        if(root==null){
            return false;
        }
        else if(root.key==x){
            return true;
        }
        else if(root.key>x){
            return search(root.left,x);
        }
        else{
            return search(root.right,x);
        }
    }

    //iterative solution 
    static boolean search2(Node root,int x){
        while(root!=null){
            if(root.key==x){
                return true;
            }
            else if( root.key>x){
                root=root.left;
            }
            else{
                root=root.right;
            }
        }
        return false;
    }
    public static void main(String[] args) {
            Node root=new Node(50);
            root.left=new Node(30);
            root.right=new Node(70);
            root.left.left=new Node(25);
            root.right.right=new Node(80);
            root.left.right=new Node(40);
            root.right.left=new Node(60);
            System.out.println(search(root, 60));
            System.out.println(search2(root, 100));
    }
    
}
