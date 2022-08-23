public class firstOccurenceIndex {

    //check the first occurence of a number and return its index
    static int firstOccurence(int arr[],int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                high=mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                if(mid==0 || arr[mid-1]!=arr[mid]){
                    return mid;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    //check the last occurence of a number and return its index
    //recursive solution
    static int last(int arr[],int low,int high,int x){
          int n=arr.length;
          if(low>high){
            return -1;
          }
          int mid=(low+high)/2;
          if(arr[mid]>x){
            return last(arr, low, mid-1, x);
          }
          else if(arr[mid]<x){
            return last(arr, mid+1, high, x);
          }
          else{
            if(mid==n-1 || arr[mid+1]!=arr[mid]){
                return mid;
            }
            else{
                return last(arr, mid+1, high, x);
            }
          }
    }
    //count number of occurences of a element in a sorted array
    //time complexity O(logn)
    static int numberOfOccurence(int arr[],int x){
        int n=arr.length;
        int first=firstOccurence(arr, x);
        if(first==-1){
            return 0;
        }
        else{
            return ((last(arr, 0, n-1, x)-first)+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,10,10,10,20,20,40};
        System.out.println(firstOccurence(arr, 20));
        int n=arr.length;
        System.out.println(last(arr, 0, n-1, 20));
        System.out.println(numberOfOccurence(arr, 10));
    }
}
