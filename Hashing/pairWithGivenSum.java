
import java.util.HashSet;

public class pairWithGivenSum {
    //function to check whether a given sum pair is present in the array or not
    static Boolean hasPair(int arr[],int sum){
        int n=arr.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            if(hs.contains(sum-arr[i])){
                return true;
            }
            hs.add(arr[i]);
        }
       return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=9;
        System.out.println(hasPair(arr, sum));
    }
    
}
