public class removeDuplicates {
    /*naive solution--we create an temporary array and find the distinct elements and later copy back all the eleents back to the original array */
    //we need to print the original array size
    static int remove(int arr[]){
        int n=arr.length;
        int temp[]=new int[n];
        temp[0]=arr[0];
        int res=1;
        for(int i=1;i<n;i++){
            if(temp[res-1]!=arr[i]){
                temp[i]=arr[i];
                res++;
            }
        }
        //copying back to the original array
        // for(int j=0;j<res;j++){
        //     arr[j]=temp[j];
        // }
        return res;

    }
    //efficient approach
    static int remove2(int arr[]){
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,3,3,4};
        System.out.println(remove(arr));
        System.out.println(remove2(arr));
    }
}
