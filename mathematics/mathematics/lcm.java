
package mathematics;

import java.util.Scanner;

public class lcm {

    //method to find the lcm of two numbers
    static int findLcm(int a, int b){
        int res=Math.max(a, b);
        while(true){
            if(res%a==0 && res%b==0){
                return res;
            }
            res++;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        System.out.println(findLcm(a, b));

    }
}
