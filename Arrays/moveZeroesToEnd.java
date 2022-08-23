public class moveZeroesToEnd {
    //naive solution O(n square)
    static void moveToEnd(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int j=i+1;j<n;j++){
                    if(arr[j]!=0){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
    //efficient approach
    static void move(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }

    }
    //left rotate and array by one
    static void leftRotate(int arr[]){
        int temp=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
             arr[i-1]=arr[i];
        }
        arr[n-1]=temp;

        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={8,5,0,10,0,20};
        // moveToEnd(arr);
        // move(arr);
        leftRotate(arr);
    }
}
