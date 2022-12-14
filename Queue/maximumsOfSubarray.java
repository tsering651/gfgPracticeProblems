package Queue;

public class maximumsOfSubarray {

    //function to find the maximum of the subarray with sike k
    //naive approach
    static void maxSub(int arr[],int k){
        int n=arr.length;
        for(int i=0;i<n-k+1;i++){
            int max=arr[i];
            for(int j=i+1;j<i+k;j++){
                max=Math.max(max, arr[j]);
            }
            System.out.print(max +" ");
        }
    }
    public static void main(String[] args){
          int arr[]={10,8,5,12,15,7,6};
          maxSub(arr, 3);
    }
    
}
