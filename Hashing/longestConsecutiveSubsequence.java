import java.util.HashSet;

public class longestConsecutiveSubsequence {

    //find the longest consecutive subsequence;
    static int findLongest(int arr[]){
       
        HashSet<Integer> hs=new HashSet<>();
        for(int x:arr){
            hs.add(x);
        }
        int res=1;
        for(Integer m:hs){
            if(hs.contains(m-1)==false){
                int count=1;
                while(hs.contains(m+count)){
                    count++;
                }
                res=Math.max(res,count);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,9,20};
        System.out.println(findLongest(arr));
    }
    
}
