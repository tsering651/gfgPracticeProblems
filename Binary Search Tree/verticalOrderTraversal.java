import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node{
    int key;
    Node left;
    Node right;
    public Node(int data){
        this.key=data;
    }
}

class Pair{
    Node node;
    int hd;
    //constructor
    public Pair(Node n,int hd){
        node=n;
        hd=hd;
    }
}


public class verticalOrderTraversal {

    //function to fill the treemap with respect to their horizonal distance
    //we do level order traversal because node with same hd should be printed from top to bottom
    static void levelOrder(Node root){
        Queue<Pair> q=new LinkedList<>();
        TreeMap<Integer,ArrayList<Integer>> mp=new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr=q.remove();
            Node curr2=curr.node;
            int hd=curr.hd;

            if(mp.containsKey(hd)){
                mp.get(hd).add(hd,curr2.key);
            }
            else{
                ArrayList<Integer> ar=new ArrayList<>();
                ar.add(curr2.key);
                mp.put(hd,ar);
            }
            if(curr2.left!=null){
                q.add(new Pair(curr2.left,hd-1));
            }
            if(curr2.right!=null){
                q.add(new Pair(curr2.right, hd+1));
            }
        }
        for(Map.Entry<Integer,ArrayList<Integer>> m:mp.entrySet()){
            System.out.println(m.getValue());
     }
    }
    //function to print the map c
    // static void print(Node root){
    //     TreeMap<
        
    // }

    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(70);
        root.left.left=new Node(25);
        root.right.right=new Node(0);
        root.left.right=new Node(40);
        root.right.left=new Node(60);
        levelOrder(root);
    }
}
