
package InterviewQuestions;

public class selectionSort {
    // selection sort
    static void selection(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // swapping two numbers

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    //bubble sort
    static void buubleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 5, 4, 0 };
       // selection(arr);
        buubleSort(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

}
