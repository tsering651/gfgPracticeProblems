package mathematics;

 import java.util.Scanner;

public class digitCount {

    //method to find the number of digits
    static int countTheDigits(int n){
          int count=0;
          while(n>0){
              n=n/10;
              count++;
          }
          return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Number of digits presnt is "+ countTheDigits(n));

        
    }
    
}
