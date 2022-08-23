public class primeFactors {

    //method to print the prime factor --->naive approach
    static void printPrime(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                int x=i;
                while(n%x==0){
                    System.out.print(i +" ");
                    x=x*i;

                }

            }
        }
    }

    static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2 ||n==3){
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
        int n=13;
        printPrime(n);
    }
}
