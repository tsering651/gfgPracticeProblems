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
    public Pair(Node node,int hd){
        node=node;
        hd=hd;
    }
}

public class topViewBinaryTree {

    //function to print the top view of the binary tree
    // static void topView(Node root){
    //     Map<Integer,Integer> mp=new TreeMap<>();
    //     Queue<Pair> q=new LinkedList<>();
    //     q.add(new Pair(root,0));

    //     while(!q.isEmpty()){
    //         Pair p=q.remove();
    //         Node curr=p.node;
    //         int hd=p.hd;
    //         if(mp.containsKey(hd)==false){
    //             mp.put(hd, curr.key);
    //         }
    //         if(curr.left!=null){
    //             q.add(new Pair(curr.left,hd-1));
    //         }
    //         if(curr.right!=null){
    //             q.add(new Pair(curr.right,hd+1));
    //         }
    //     }
    //     //printing the map
    //     for(Map.Entry<Integer,Integer> m:mp.entrySet()){
    //         System.out.print(m.getValue()+" ");
    //     }
    // }
    public static void topView(Node root){
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> mp=new TreeMap<>();
        q.add(new Pair(root,0));
        while(q.isEmpty()==false){
            Pair p=q.poll();
            Node curr=p.node;
            int hd=p.hd;
            if(mp.containsKey(hd)==false)
                mp.put(hd,curr.key);
            if(curr.left!=null)
                q.add(new Pair(curr.left,hd-1));
            if(curr.right!=null)
                q.add(new Pair(curr.right,hd+1));
        }
        for(Map.Entry<Integer,Integer> x:mp.entrySet()){
                System.out.print(x.getValue()+" ");
        }
    }
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(70);
        root.left.left=new Node(25);
        root.right.right=new Node(80);
        root.left.right=new Node(40);
        root.right.left=new Node(60);
        topView(root);
    }
    
}
