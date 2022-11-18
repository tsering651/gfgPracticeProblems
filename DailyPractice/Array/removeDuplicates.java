package DailyPractice.Array;

import java.util.HashSet;

public class removeDuplicates{

    //function to remove duplicates from array using hashset
    static void remove(int arr[]){
        int n=arr.length;
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        System.out.print(hs+" ");
        // for(int i=0;i<hs.size();i++){
        //     System.out.println(hs.g);
        // }
    }
   public static void main(String[] args){
     int arr[]={1,2,2,3,4,5,6};
     remove(arr);
   }
}
    

