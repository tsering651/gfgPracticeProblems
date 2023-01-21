import java.util.HashSet;

public class subarrayWithSum0 {
    //naive approach
    static Boolean hasSubArray(int arr[],int sum){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int currSum=0;
            for(int j=i;j<n;j++){
                currSum+=arr[j];
                if(currSum==sum){
                    return true;
                }
            }
        }
        return false;
    }
    //efficient solution using prefix sum and hashset
    static Boolean hasSub(int arr[]){
        HashSet<Integer> hs=new HashSet<>();
        int n=arr.length;
        int prefix_sum=0;
        for(int i=0;i<n;i++){
            prefix_sum+=arr[i];
            if(hs.contains(prefix_sum)){
                return true;
            }
            if(prefix_sum==0){
                return true;
            }
            hs.add(prefix_sum);
        }
        return false;
    }

    //efficient solution to find subarray for a given sum exits or not
    static Boolean hasSub2(int arr[],int sum){
        HashSet<Integer> hs=new HashSet<>();
        int n=arr.length;
        int prefix_sum=0;
        for(int i=0;i<n;i++){
            prefix_sum+=arr[i];
            if(hs.contains(prefix_sum-sum)){
                return true;
            }
            if(prefix_sum==sum){
                return true;
            }
            hs.add(prefix_sum);
        }
        return false;
    }

   

    public static void main(String[] args) {
        
    }
    
}
