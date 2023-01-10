
// class Node{
//     int key;
//     Node left;
//     Node right;
//     public Node(int data){
//         this.key=data;
//     }
// }

// public class swapTwoNodesBST {

//     //function to find which two nodes doesnot follow BST property using inorder traversal
//     static Node prev=null;
//     static Node first=null;
//     static Node second=null;
//     static void findNodes(Node root){
//             if(root==null){
//                 return;
//             }
//             if( prev!=null && root.key<prev.key){
//                 if(first==null){
//                     first=prev;
//                 }
//                 second=root;
//             }
//             prev=root;
//             findNodes(root.right);
//     }
//     public static void inorder(Node root){
//         if(root!=null){
//             inorder(root.left);
//             System.out.print(root.key+" ");
//             inorder(root.right);
//         }
//     }
//     public static void main(String[] args) {
//         Node root = new Node(18);  
//         root.left = new Node(60);  
//         root.right = new Node(70);  
//         root.left.left = new Node(4);  
//         root.right.left = new Node(8);
//         root.right.right = new Node(80);  
          
//         inorder(root); 
//         System.out.println();;
//         findNodes(root);
//         int temp=first.key;
//         first.key=second.key;
//         second.key=temp;
//         inorder(root);
//     }
    
// }

import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int key;
    Node left, right;
    Node(int x)
    {
        key = x;
        left = right = null;
    }
}

class swapTwoNodesBST
{
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    
    static Node prev=null,first=null,second=null;
    public static void fixBST(Node root)  
    {  
        if (root == null)  
            return;  
        fixBST(root.left);
        if(prev!=null && root.key<prev.key){
            if(first==null)
                first=prev;
            second=root;
        }
        prev=root;
        
        fixBST(root.right);
    }
    
    public static void main(String args[])
    {
        Node root = new Node(18);  
        root.left = new Node(60);  
        root.right = new Node(70);  
        root.left.left = new Node(4);  
        root.right.left = new Node(8);
        root.right.right = new Node(80);  
          
        inorder(root); 
        System.out.println();;
        fixBST(root);
        int temp=first.key;
        first.key=second.key;
        second.key=temp;
        inorder(root);
    }
}
