public class maximumSumSubarray {
    static int maximum(int arr[]){
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                res=Math.max(sum,res);
            }
        }
        return res;
    }
    static int maximum2(int arr[]){
        int res=arr[0];
        int maxEnding=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i] );
            res=Math.max(maxEnding,res);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,3,-8,7,-1,2,3};
        System.out.println(maximum2(arr));
    }
    
}
