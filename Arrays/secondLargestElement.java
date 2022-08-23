public class secondLargestElement {

    /*naive approach---first find the largest element and then create a new function to find second largest */
    static int findLargest(int arr[]){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=i;
            }
        }
        return largest;
    }

static int secondLargest(int arr[]){
    int largest=findLargest(arr);
    int res=-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=arr[largest]){
            if(res==-1){
                res=i;
            }
             if(arr[i]>arr[res]){
                res=i;
            }
        }
        
    }
    return res;
}

/*Efficient approach --we can find the second largest in one traversal only */

static int findSecondLargest(int arr[]){
    int res=-1;
    int largest=0;
    for(int i=1;i<arr.length;i++){
        if(arr[i]>arr[largest]){
            res=largest;
            largest=i;
        }
        if(arr[i]!=arr[largest]){
            if(res==-1 || arr[i]>arr[res]){
                res=i;
            }
        }
    }
    return res;
}
    public static void main(String[] args) {
         int arr[]={10,10,10};
        // System.out.println(secondLargest(arr)); 
        System.out.println(findSecondLargest(arr));
        
    }
}
