public class primeNumber {

    //efficient approach to check for prime or nit
    static boolean checkPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //most efficient approach
    static boolean checkForPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=101;
       // System.out.println(checkPrime(n));
        System.out.println(checkForPrime(n));
    }
}
