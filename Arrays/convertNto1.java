import java.util.Scanner;

public class convertNto1 {
    //find repeating element
    static void repeter(int arr[]){
        int n=arr.length;
        int repaeting=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] !=repaeting){
                repaeting=arr[i];
            }
            else{
                System.out.println(repaeting);
            }
        }
    }
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
		// //int t=sc.nextInt();
		// int  N=sc.nextInt();
        // int arr[]=new int[N];
        // for(int i=0;i<N;i++){
        //     arr[i]=sc.nextInt();
        // }
        // for(int k=0;k<N;k++){
        //     System.out.println(arr[k]);
        // }
	
		// int count=0;
	    // if(N==0){
	    //     count=1;
	    //      System.out.println(count);
	    // }
	    // // if(N==1){
	    // //     System.out.println(count);
	    // // }
	    
	    // while(N>1){
	    //   if(N%2==0){
	    //       N=N/2;
	    //       count++;
	    //   }
	    //   else{
	    //       N=N-1;
	    //       count++;
	    //   }
	    // }
	    // System.out.println(count);
        int arr[]={1,2,3,3,3};
        repeter(arr);
	}

    }
    
