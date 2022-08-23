public class allDivisors {

    //method to print all divisors of a number
    static void printDivisors(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
                if(i !=n/i){
                    System.out.print(n/i+" ");
                }
            }
           
        }
    }
    public static void main(String[] args) {
        int n=15;
        printDivisors(n);
    }
}
