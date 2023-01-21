package Heap;

import java.util.Iterator;
import java.util.PriorityQueue;

public class kLargestElement {

    //printing the kth largest element from the array
    static void printKLargest(int arr[],int k){
         //creating a min heap of first k element
         PriorityQueue<Integer> p=new PriorityQueue<>();
         for(int i=0;i<k;i++){
             p.add(arr[i]);
         }
         for(int i=k;i<arr.length;i++){
             if(p.peek()<=arr[k]){
                p.poll();
                p.add(arr[i]);
             }
             else{
                continue;
             }
         }
         //printing the contents of the heap;
         Iterator iterator = p.iterator(); 
	
         while (iterator.hasNext()) 
         { 
             System.out.print(iterator.next() + " "); 
         } 
    }
    public static void main(String[] args) {
        int arr[]={8,6,4,10,9};
        int k=3;
        printKLargest(arr, k);
    }
    
}
