public class factorial {
    //method to find the factorial of a number using recursion
    static int fact(int n){
          if(n==0){
              return 1;
          }

        return n* fact(n-1);
    }

    //method to find the fibonacci series number
    static int fib(int n){

        if(n<=1){
            return n;
           }
         return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {

        int n=4;
        System.out.println(fib(n));
        System.out.println(fact(n));
        
    }
}
