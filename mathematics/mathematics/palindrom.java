 
 package mathematics;
 import java.util.Scanner;


public class palindrom {


    //function to check the palindrome of a number
    static boolean checkPalindrome(int n){
        int rev=0;
        int temp=n;
        while(temp != 0){
            int lastDigit=temp%10;
            rev= rev*10 +lastDigit;
            temp=temp/10;
        }
        return (n==rev) ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(checkPalindrome(n));

    }
}
