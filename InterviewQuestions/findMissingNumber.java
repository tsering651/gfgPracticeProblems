package InterviewQuestions;

import java.util.Arrays;

public class findMissingNumber {
    //function to find the missing number in the given array
    static int findMissing(int arr[]){
        int n=arr.length;
         boolean arr2[]=new boolean[n+1];
         Arrays.fill(arr2,false);
         for(int i=0;i<n;i++){
            arr2[arr[i]-1]=true;
         }

         for(int j=0;j<n;j++){
            if(arr2[j]==false){
                return j+1;
                
            }
         }


         return 0;

         
    } 
    //optimized solution
    static int missingNumber(int arr[]){
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int actual =0;
        for(int num:arr){
            actual+=num;
        }
        return sum-actual;
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,2,6};
       // System.out.println(findMissing(arr));
      System.out.println(missingNumber(arr));
    }
    
}
