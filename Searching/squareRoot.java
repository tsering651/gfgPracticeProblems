public class squareRoot {

    //naive solution
    static int findSqrt(int x){
        int i=1;
        while(i*i<=x){
            i++;
        }
        return i-1;
    }
    //efficient solution using binary search
    static int find(int x){
        int low=1;
        int high=x;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int midSqrt=mid*mid;
            if(midSqrt==x){
                return mid;
            }
            else if(midSqrt>x){
                high=mid-1;
            }
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args){
         int x=16;
         System.out.println(findSqrt(x));
         System.out.println(find(x));
    }
    
}
