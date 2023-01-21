package Heap;

 class minHeap{
     static int arr[];
     static int size;
     static int capacity;
     public minHeap(int c){
        arr=new int[c];
        size=0;
        capacity=c;
     }

     //function to get the left child 
     static int leftChild(int i){
        return (2*i+1);
     }
     //function to get the right child
     static int rightChild(int i){
        return (2*i+2);
     }
     //function to get the parent 
     static int parent(int i){
        return (i-1)/2;
     }
     //insert function 
     static void insert(int x){
        if(size==capacity) {
            return;
        }
        size++;
        arr[size-1]=x;
        for(int i=size-1; i!=0 && arr[parent(i)]>arr[i];){
              //swapping
              int temp=arr[i];
              arr[i]=arr[parent(i)];
              arr[parent(i)]=temp;
              i=parent(i);
        }
     }
     //swap function
     static void swap(int a,int b){
        int temp=a;
           a=b;
          b=temp;
     }


     //heapitfy function--given index of the element which violates the heapify Property
     static void minHeapify(int arr[],int n, int i){
            int left=leftChild(i);
            int right=rightChild(i);
            int smallest=i;

         if(left<n && arr[left]<arr[i]){
            smallest=left;
         }
         if(right<n && arr[right]<arr[smallest] ){
             smallest=right;
         }
         if(smallest!=i){
            swap(arr[i],arr[smallest]);
            minHeapify(arr, n, smallest);
         }
     }

     //heapify function for max heap
     static void maxHeapify(int arr[],int n, int i){
      int left=leftChild(i);
      int right=rightChild(i);
      int largest=i;

   if(left<n && arr[left]>arr[i]){
      largest=left;
   }
    if(right<n && arr[right]>arr[largest] ){
       largest=right;
   }
   if(largest!=i){
      swap(arr[i],arr[largest]);
      minHeapify(arr, n, largest);
   }
}

//extract minimum or remove the root from the  min heap and return the removed item
static int extractMin(int arr[],int n){
   int size=n;
    if(n==0){
      return 0;
    }
    if(n==1){
      size--;
      return arr[0];
    }
    swap(arr[0],arr[size-1]);
    size--;
    minHeapify(arr, size, 0);
    return arr[size-1];
}






}
public class minHeapImplementation {
    public static void main(String[] args) {
   

    }
    
}
