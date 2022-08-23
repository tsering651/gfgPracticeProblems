// import javax.xml.validation.ValidatorHandler;

public class binarySearchIterative {

    //binary search(time complexity O(log n))
    static int search(int arr[],int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
              high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
 static int majorityWins(int arr[], int n, int x, int y) {
        // code here
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                ++count1;
            }
        }
       
        int count2=0;
        for(int j=0;j<n;j++){
            if(arr[j]==y){
                ++count2;
            }
        }
       
        if(count1>count2){
            return x;
        }
        else if(count1==count2 && x>y){
            return y;
        }
        else if(count1==count2 && x<y){
            return x;
        }
        else{
            return y;
        }
        
    }
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,6,7};
        // int k=6;
        // System.out.println(search(arr, k));
        int arr[]={98, 99 ,39 ,12, 0, 36 ,15, 47, 79 ,62, 64};
        int x=64;
        int y=5;
        System.out.print(majorityWins(arr,11,x,y));
        
    }
}
