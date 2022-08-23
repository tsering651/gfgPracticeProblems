public class problem1 {

    //recursion basic problem
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
        System.out.println(n);
    }
    //recursion basic problem 2
    public static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
        fun(n-1);
    }
    //problem 3
    static int fun1(int n){
        if(n==1){
            return 0;
        }
        else{
            return 1+fun1(n/2);
        }
    }
    //problem 4
    //decimal to binary conversion
    static void decimalToBinary(int n){
        if(n==0){
            return;
        }
        decimalToBinary(n/2);
        System.out.print(n%2);
    }
    public static void main(String[] args) {
       // printNum(5);
      // fun(3);
         // System.out.println(fun1(16));
         decimalToBinary(10);
    }
}
