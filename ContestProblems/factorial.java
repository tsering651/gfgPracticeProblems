package ContestProblems;

public class factorial {

    static int fact(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }
    //recursive

    static int fact2(int n)
    {
 
        
        return (n == 1 || n == 0) ? 1 : n * fact2(n - 1);
    }
    //dynamic aaproach
     static int fact3(int n) {
        int result[]=new int[n+1];
        if (n >= 0) {
           result[0] = 1;
           for (int i = 1; i <= n; ++i) {
              result[i] = i * result[i - 1];
           }
           
        }
        return result[n];
     }
    public static void main(String[] args) {
        int n=5;
        System.out.println("Factorial is "+ fact(n));
        System.out.println(fact3(n));
    }
    
}
