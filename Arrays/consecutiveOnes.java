public class consecutiveOnes {
    static int numberOfOnes(int arr[]){
        int n=arr.length;
        int res=0;
        int current=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                current=0;
            }
            else{
                current++;
                res=Math.max(current, res);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={0,0,0};
        System.out.println(numberOfOnes(arr));
    }
}
