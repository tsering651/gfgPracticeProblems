import java.util.HashMap;

public class longestSubArray {

    //longest subarray with given sum
    static int myfn(int arr[],int sum){
        int n=arr.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int prefix_sum=0;
        int res=0;
        for(int i=0;i<n;i++){
            prefix_sum+=arr[i];
            if(prefix_sum==sum){
                res=i+1;
            }
            if(mp.containsKey(prefix_sum)==false){
                mp.put(prefix_sum,i);
            }
            if(mp.containsKey(prefix_sum-sum)){
                res=Math.max(res,i-mp.get(prefix_sum-sum));
            }
            
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={5,8,-4,-4,9,-2,2};
        int sum=0;
        System.out.println(myfn(arr, sum));
    }
    
}
