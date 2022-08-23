public class lcm {


    //naive approach to find the lcm of two numbers
    static int findLcm(int a , int b){
        //lcm of two numbers is always greater the or equal to that number
        int res=Math.max(a, b);
        while(true){
            if(res%a==0 && res%b==0){
                return res;
            }
            res++;

        }
    }
    //efficient approach based on the formula

    static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    static int findlcmEfficiently(int a,int b){
        return a*b/gcd(a, b);

    }
    public static void main(String[] args) {
        int a=3;
        int b=7;
       // System.out.print( findLcm(a, b));
        System.out.print( findlcmEfficiently(a, b));
    }
    
}
