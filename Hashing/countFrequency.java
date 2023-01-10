import java.util.HashMap;
import java.util.Map;


public class countFrequency {
    //function to print the frequency of the elements in the arrray
    static void countFrequency(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i], 0)+1);
        }
        //printing the key value pair 
        for(Map.Entry<Integer,Integer> m:mp.entrySet()){
            System.out.println(m.getKey()+" "+ m.getValue());
        }

    }
    public static void main(String[] args) {
        int arr[]={2,2,1,3,4,4,4};
        countFrequency(arr);
    }
    
}
