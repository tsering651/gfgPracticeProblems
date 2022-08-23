public class findLargestElement {
    //naive approach O(n square) time complexity

    static int findLargest(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean flag =true;
            for(int j=0;j<n;j++){
                if(arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                return i;
            }
        }
        return -1;
    }
    //my approach
static int secondApproach(int arr[]){
    int largest=arr[0];
    int n=arr.length;
    for(int i=1;i<n;i++){
        if(arr[i]>largest){
            largest=i;
        }
    }
    return largest;
}

    public static void main(String[] args) {
        int arr[]={12,13,1,19};
      //  System.out.println(findLargest(arr));
      System.out.println(secondApproach(arr));
        
    }
}
