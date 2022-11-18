public class selectionSort {
    //selection sorting
    static void selection(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
           // swap(arr[min_index],arr[i]);
           int temp=arr[min_index];
           arr[min_index]=arr[i];
           arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }


    public static void main(String[] args) {
        int arr[]={4,2,3,1,0,10};
        selection(arr);
    }
    
}
