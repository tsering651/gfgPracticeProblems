import java.util.HashMap;

public class longestSubArrayWith01 {
    //find longest subarray with equal number of zeroes and ones
    static int findLongest(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        //replacing all 0 with -1
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        //longest subarray with sum 0;
        int prefixSum=0;
        int res=0;
        for(int j=0;j<n;j++){
            prefixSum+=arr[j];
            if(prefixSum==0){
                res=j+1;
            }
            if(mp.containsKey(prefixSum)==false){
                 mp.put(prefixSum,j);
            }
            if(mp.containsKey(prefixSum)){
                res=Math.max(res,j-mp.get(prefixSum));
            }
        }
        return res;

        
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,0,0};
        System.out.println(findLongest(arr));
    }
    
}
