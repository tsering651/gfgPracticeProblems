public class setBitsCheck {

    //naive solution
    static int checkNumberSetBits(int n){
        int res=0;
        while(n>0){
            // if(n%2 !=0){
            //    res++;
            // }
            // n=n/2;
            if((n&1)==1){
                res++;

            }
            n=n>>1;

        }
        return res;

    }
    //brian kerningmas algo
    static int checkset(int n){
        int res=0;
        while(n>0){
            n=n&(n-1);
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        int n=13;
       // System.out.println(checkNumberSetBits(n));
       System.out.println(checkset(n));
      
    }
}
