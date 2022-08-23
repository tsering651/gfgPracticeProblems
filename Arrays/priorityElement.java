public class priorityElement {
    //priority element in an array is one which appears more then n/2 times
    static int priority(int arr[]){
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
               
            }
            if(count>n/2){
                return i;
            }

        }
        return -1;
    }
    //efficient method
    static int findMajority(int arr[]){
        int count=1;
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res=i;
                count=1;
            }
           

        }
        count=0;
        //this will check if the candidate is majority element or not
        for(int i=0;i<arr.length;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            if(count<arr.length/2){
                return -1;


        
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={8,3,4,8,8};
        System.out.println(priority(arr));
    }
}
