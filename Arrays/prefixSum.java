public class prefixSum {
    //question 1 multiple queries
    static int getSum(int arr[],int left,int right){
        int n=arr.length;
        int prefix_sum[]=new int[n];
        prefix_sum[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix_sum[i]+=arr[i];
        }
        if(left!=0){
            return prefix_sum[right]-prefix_sum[left-1];
        }
        else{
            return prefix_sum[right];
        }
       
    }
    //question 2    Equilibrium point in an array
    static boolean hasEquilibrium(int arr[]){
        int n=arr.length;
        int total_sum=0;
        //finding the total sum
        for(int i=0;i<n;i++){
            total_sum+=arr[i];
        }
        int left_sum=0;
        for(int j=0;j<n;j++){
            if(left_sum==(total_sum-arr[j])){
                return true;
            }
            left_sum+=arr[j];
            total_sum-=arr[j];
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={2,8,3,9,6,5,4};
        System.out.println(getSum(arr, 1, 3));
        int arr2[]={3,4,8,-9,20,6};
        System.out.println(hasEquilibrium(arr));
    }
}
