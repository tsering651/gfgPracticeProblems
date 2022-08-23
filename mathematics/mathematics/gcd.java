package mathematics;

import java.util.Scanner;

public class gcd {

    //naive approach
    static int hcfOftwoNumbers(int a ,int b){
        int res=Math.min(a, b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }
    //Euclidians algorithm
    static int euclidian(int a , int b){
        while(a != b ){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    //optimized Euclideans algo
    static int euclidian02(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return euclidian(b, a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       // System.out.println(hcfOftwoNumbers(a, b));
        System.out.println(euclidian02(a, b));
    }
}
