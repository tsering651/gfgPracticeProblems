package mathematics;

import java.util.Scanner;

public class trailingZero {

    //naive approach
    static int countZeros(int n){
           int fact=1;
           for(int i=2;i<=n;i++){
               fact=fact*i;
           }
           int res=0;
           while(fact%10==0){
               res++;
               fact=fact/10;
           }
           return res;
    }
    //efficient approach
    static int countzeroes02(int n){
        int res=0;
        for(int i=5;i<=n;i=i*5){
             res=res+ (n/i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println(countzeroes02(n));

    }
}
