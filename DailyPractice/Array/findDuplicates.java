package DailyPractice.Array;

import java.util.HashSet;
import java.util.Set;

public class findDuplicates {
    //function to find the duplicates elements from and array in o(n) time cpmplexity

    static void find(int arr[]){
        int n=arr.length;
        Set<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            if(hs.contains(arr[i])){
                System.out.println("Duplicate elements is "+arr[i]);
            }
            else{
                hs.add(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,7,7,10,10};
        find(arr);

    }
    
}
