import java.util.HashSet;

public class union {

    //function top return the count of numbers of common distict elements ion the two array
    static int uni(int a[],int b[]){
        int m=a.length;
        int n=b.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<m;i++){
            hs.add(a[i]);
        }
        for(int j=0;j<m;j++){
            hs.add(b[j]);
        }
        return hs.size();
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={2,3,4,5};
        System.out.println(uni(a, b));
    }
    
}
