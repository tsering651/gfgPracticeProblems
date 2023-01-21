import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



public class maximumAppearingElement {
    //function to find the maximum appearing element in the given range 
    static int maxAppeared(int a[],int b[]){
        TreeMap<Integer,Integer> hs=new TreeMap<>();
        int m=a.length;
        int n=b.length;
       
        for(int i=0;i<m;i++){
           for(int k=a[i];k<=b[i];k++){
                 hs.put( k,hs.getOrDefault(k, 0)+1 );
           }
           
        }
        int max=0;
        int ans=0;

        
        for(Integer key:hs.keySet()){
          //  max=Math.max(max,hs.get(key));
            if(hs.get(key)>max){
                max=hs.get(key);
                ans=key;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]= {1, 4, 3, 1}, b[] = {15, 8, 5, 4};
        System.out.println(maxAppeared(a, b));
    }
    
}
