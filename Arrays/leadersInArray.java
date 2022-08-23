public class leadersInArray {
    //naive solution
    static void findLeaders(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.print(arr[i]+" ");
            }
        }
    }
    //efficient approach
    static void find(int arr[]){
        int n=arr.length;
        int current_leader=arr[n-1];
        System.out.print(current_leader+" ");
      
        for(int i=n-2;i>=0;i--){
            if(current_leader < arr[i]){
               current_leader=arr[i];
               System.out.print(current_leader+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={7,10,4,3,6,5,2};
        findLeaders(arr);
        find(arr);
    }
}
