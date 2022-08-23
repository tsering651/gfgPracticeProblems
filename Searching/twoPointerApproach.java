public class twoPointerApproach {
    //given a sorted array we need to find if there exits a pair whose sum is equal to x
    static boolean findPair(int arr[],int x){
            int n=arr.length;
            int low=0;
            int high=n-1;
            while(low<high){
                if(arr[low]+arr[high]==x){
                     return true;
                }
                else if(arr[low]+arr[high]>x){
                    high--;
                }
                else{
                    low++;
                }
            }
            return false;
    }
    public static void main(String[] args) {
        int arr[]={2,5,8,12,30};
        System.out.println(findPair(arr, 17));
    }
}
