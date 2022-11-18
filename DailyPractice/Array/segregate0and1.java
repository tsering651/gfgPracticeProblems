package DailyPractice.Array;

public class segregate0and1 {

    //You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array [Basically you have to sort the array]. Traverse array only once. 

    static void segregate(int arr[]){
        int n=arr.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[k]=arr[i];
                k++;
            }
        }
        while(k<n){
            arr[k]=1;
            k++;
        }
          for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    // static void printArray(int arr[]){
    //     int n=arr.length;
      
    // }
   public static void main(String[] args){
      int arr[]={0,1,1,1,0,0,0};
      segregate(arr);
      //printArray(arr);

   }
    
}
