public class searchInRotatedSorted {

    //given an sorted rotated array we need to search for an element
    static int search(int arr[],int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            //checking which part of the array is sorted
            //left part sorted condition
        if(arr[mid]>arr[low])
        {
            if(x<arr[mid]&& x>arr[low]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        //right part is sorted
       else{
            if(x>arr[mid] && x<=arr[high]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        }
        return -1;
    }
    public static void main(String[] args) {
         int arr[]={10,20,30,40,50,8,9};
         int x=30;
         System.out.println(search(arr,x));
    }
    
}
