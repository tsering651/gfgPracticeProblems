package ContestProblems;

public class coinExchangeProblem {
    //greedy appraoch'
    static void coinExhange(int arr[],int productCost){
        int n=arr.length;
        int res[]=new int[n];
        int i=0;
        while(productCost!=0 && i<n){
            if(arr[i]>productCost){
                i++;
               
            }
            else{
                res[i]=arr[i];
                productCost=productCost-arr[i];
                i++;

            }
        }
        
        for(int x:res){
            System.out.print( x+" ");
        }

        }
    
    public static void main(String[] args) {
        int arr[]={1,5,3};
        int productCost=10;
        coinExhange(arr, productCost);
        
        
    }
    
}
