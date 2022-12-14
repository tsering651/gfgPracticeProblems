public class leftRotateByD {

    //naive solution 
    static void leftRotateByOne(int arr[]){
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    static void leftRotate(int arr[],int d){
        int n=arr.length;
        for(int j=0;j<d;j++){
            leftRotateByOne(arr);
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }


    }

    //efficient approach
    static void leftrot(int arr[],int d){
        int n=arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
    static void reverse(int arr[],int low,int high){
        while(low<high){
            swap(arr[low],arr[high]);
            low++;
            high--;
        }
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        int arr[]={10,5,13,15};
        leftRotate(arr, 3);
        //leftrot(arr, 3);

    }
}
