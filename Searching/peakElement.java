public class peakElement {

    //find the peak element in the array
    //naive solution O(n)
    static int findPeak(int arr[]){
        int n=arr.length;
        //handling the edge cases
        if(n==1){
            return arr[0];
        }
        if(arr[0]>arr[1]){
            return arr[0];
        }
        if(arr[n-1]>arr[n-2]){
            return arr[n-1];
        }
        //traversing through the array
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]&& arr[i+1]<arr[i]){
                return arr[i];
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[]={5,10,20,15,7};
        System.out.println(findPeak(arr));
        int arr2[]={80,70,60};
        System.out.println(findPeak(arr2));
    }
    
}
