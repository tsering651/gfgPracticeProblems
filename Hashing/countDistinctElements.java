import java.util.HashSet;



public class countDistinctElements {

    //function to count distict elements in the array
    static int count(int arr[]){
        int n=arr.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,4};
        System.out.println("The number of distinct elements in the array is "+ count(arr));
    }
    
}
