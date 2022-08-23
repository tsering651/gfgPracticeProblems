public class consecutiveEvenOdd {

    //method to find max length of even odd subarray
    static int maximumLength(int arr[]){
        int res=1;
        for(int i=0;i<arr.length;i++){
            int current=1;
            for(int j=i+1;j<arr.length;j++){
                 if(arr[j-1]%2==0 && arr[j]%2 !=0  || arr[j-1]%2!=0 && arr[j]%2==0){
                    current++;
                }
                else{
                    break;
                }
            }
            res=Math.max(current,res);


        }
        return res;
    }
    //efficient approach
    static int maxEvenOdd(int arr[]){
        int res=1;
        int current=1;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1]%2==0 && arr[i]%2 !=0  || arr[i-1]%2!=0 && arr[i]%2==0){
                current++;
                res=Math.max(current,res);

            }
            else{
                current=1;
            }
        }
        return res;
    }

   public static void main(String[] args) {
      int arr[]={7,10,13,14};
      System.out.println(maximumLength(arr));
      System.out.println(maxEvenOdd(arr));
   } 
}
