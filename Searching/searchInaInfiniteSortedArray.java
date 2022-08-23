public class searchInaInfiniteSortedArray {
    //if the array is infinte or having a large number of elements
    static int search(int arr[],int x){
          int i=1;
          if(arr[0]==x){
            return 0;
          }
          while(arr[i]<x){
            i=2*i;
          }
          if(arr[i]==x){
            return i;
          }
          return binarysearch(arr,(i/2)+1,i-1,x);
    }
    static int binarysearch(int arr[],int low,int high,int x){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]>x){
             return binarysearch(arr, low, mid-1, x);
        }
        else{
             return binarysearch(arr, mid+1, high, x);
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args){
       int arr[]={1,2,3,4,5,6,7,8,9,10};
       System.out.println(search(arr,6));
    } 
  
}
