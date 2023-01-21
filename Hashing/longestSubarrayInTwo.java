import java.util.HashMap;

public class longestSubarrayInTwo {
    //longest common subarray in two array whose sum is same in both the arrays
    static int findCommonLongest(int arr1[],int arr2[]){
        int n=arr1.length;
        //creating a temp array which will store the subtraction of the two arrays
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr1[i]-arr2[i];
        }
        HashMap<Integer,Integer> mp=new HashMap<>();
        int prefixSum=0;
        int res=0;
        for(int i=0;i<n;i++){
            prefixSum+=temp[i];
            if(prefixSum==0){
                res=i+1;
            }
            if(mp.containsKey(prefixSum)==false){
                 mp.put(prefixSum,i);
            }
            if(mp.containsKey(prefixSum)){
                res=Math.max(res,i-mp.get(prefixSum));
            }
        }
        return res;


    }
    public static void main(String[] args) {
        int arr1[]={0,1,0,0,0,0};
        int arr2[]={1,0,1,0,0,1};
        System.out.println(findCommonLongest(arr1, arr2));
    }
    
}
