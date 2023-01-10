import java.util.TreeSet;

public class leftSideCeilingInArray {

    //function to find the ceiling value of and array element in its left side
    static void printCeiling(int arr[]){
        int n=arr.length;
        System.out.print("-1"+" ");
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(arr[0]);
        for(int i=1;i<n;i++){
            if(ts.ceiling(arr[i])!=null){
                System.out.print(ts.ceiling(arr[i])+" ");
            }
            else{
                System.out.print("-1 ");
            }
            ts.add(arr[i]);
        }

    }
    public static void main(String[] args) {
        int arr[]={2,8,30,15,25,12};
        printCeiling(arr);
    }
    
}
