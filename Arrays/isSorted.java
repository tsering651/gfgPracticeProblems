public class isSorted {

    //naive approch O(n square)

    static boolean checkifSorted(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }
        return true;
    }

    //efficient appraoch
    static boolean check(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={12,14,19,99};
        System.out.println(checkifSorted(arr));
        System.out.println(check(arr));
        
    }
}
