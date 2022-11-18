package DailyPractice;

public class deleteElement {

    //delete an element at a specific position
    static void delete(int arr[],int index){
        int n=arr.length;
        for(int i=index-1;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        n--;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int index=3;
        delete(arr, index);
    }
    
}
