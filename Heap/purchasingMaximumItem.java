package Heap;

import java.util.PriorityQueue;

public class purchasingMaximumItem {
    //function to find the maximum items we can purchase from the array
   static int maximumItem(int cost[],int sum){
       int n=cost.length;
       PriorityQueue<Integer> p=new PriorityQueue<>();
       //created a min heap
       for(int i=0;i<n;i++){
          p.add(cost[i]);
       }
       int res=0;
       for(int i=0;i<n;i++){
          if(p.peek()<sum){
             res++;
             sum=sum-p.poll();
          }
          else{
            break;
          }
       }
       return res;

   }
    public static void main(String[] args) {
        int cost[]={1,12,5,111,200};
        int sum=10;
        System.out.println("The maximum number of items we can purchase is "+maximumItem(cost, sum));
    }
    
}
