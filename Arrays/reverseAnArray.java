public class reverseAnArray {
    //function to reverse an array
    static void reverse(int arr[]){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<high){
            //swapping
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={12,1,3,4};
        reverse(arr);
    }

}
