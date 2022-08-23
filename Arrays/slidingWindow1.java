public class slidingWindow1 {
    // static int maximumSum(int arr[],int k){
    //     int current_sum=0;
    //     //first finding the sum of first window
    //     for(int i=0;i<k;i++){
    //         current_sum+=arr[i];
    //     }
    //     int max_sum=current_sum;
    //     int n=arr.length;
    //     for(int i=k;i<n;i++){
    //         current_sum+=(arr[i]-arr[i-k]);
    //         max_sum=Math.max(current_sum,max_sum);
    //     }
    //     return max_sum;
    // }
    //question 2
    static  boolean findSumExist(int arr[],int sum){
        int current_sum=arr[0];
        int start=0;
        int n=arr.length;
        for(int i=1;i<arr.length;i++){
            //clear first element if sum is greater then actual sum
            while(current_sum>sum ){
                current_sum-=arr[start];
                start++;
            }
            if(current_sum==sum){
                return true;
            }
            if(i<n){
                current_sum+=arr[i];
            }
        }
        return (current_sum==sum);
    }

    //question3
      static void bibonacciSeries(int n,int m){
        int arr[]=new int[m];
       for(int i=0;i<n-1;i++){
        arr[i]=0;
       }
       arr[n-1]=1;
       arr[n]=1;
       for(int i=n+1;i<m;i++){
        arr[i]=2*arr[i-1]-arr[i-n-1];
       }
       for(int i=0;i<m;i++){
        System.out.print(arr[i]+" ");
       }
      }
    public static void main(String[] args) {
        int arr[]={1,8,30,-5,20,7};
       // System.out.println(maximumSum(arr, 3));
       int arr2[]={1,4,20,3,10,5};
       //System.out.println(findSumExist(arr2, 33));
       bibonacciSeries(4, 10);
    }
}
