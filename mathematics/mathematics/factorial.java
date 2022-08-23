package mathematics;

import java.util.Scanner;

public class factorial {

    static int findFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*findFactorial(n-1);
    }

    static int findFactorialIterative(int n){
        int res=1;
        for(int i=1;i<=n;++i){
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(findFactorialIterative(n));

    }
}
