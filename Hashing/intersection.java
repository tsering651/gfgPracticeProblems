import java.util.HashSet;

public class intersection {
    //function to return the count of number of intersecting elements
    static int countIntersection(int a[],int b[]){
        int m=a.length;
        int n=b.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<m;i++){
            hs.add(a[i]);
        }
        int res=0;
        for(int j=0;j<n;j++){
            if(hs.contains(b[j])){
                res++;
                hs.remove(b[j]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={2,3,4};
        System.out.println(countIntersection(a, b));
    }
}
