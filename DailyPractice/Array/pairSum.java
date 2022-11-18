package DailyPractice.Array;

public class pairSum {
    //find the pair in the sorted array whose sum is equal to the given sum O(n) time complexity
    static void sumPair(int sum,int arr[]){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            if(arr[low]+arr[high]<sum){
                    low++;
            }
            else if(arr[low]+arr[high]>sum){
                high--;
            }
            else{
                System.out.println("Pair is "+arr[low]+" "+ arr[high]);
                low++;
                high--;
            }
        } 
    }
    public static void main(String[] args) {
        int arr[]={0,2,4,5,6,9};
        int sum=6;
        sumPair(sum, arr);
    }
         

    }
    
        