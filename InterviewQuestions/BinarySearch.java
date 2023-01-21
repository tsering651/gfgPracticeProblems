package InterviewQuestions;

public class BinarySearch {

    //binary search using while loop
    static int binaryS(int arr[],int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]> x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;

    }
    //using recursion
    static int binarys2(int arr[],int low,int high,int x){
        if(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
               return  binarys2(arr, low, mid-1, x);
            }
            else{
                 return binarys2(arr, mid+1, high, x);
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,9};
        System.out.println(binaryS(arr,9));
        System.out.println(binarys2(arr, 0, arr.length-1, 9));
    }
}
