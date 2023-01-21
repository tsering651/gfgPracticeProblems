package InterviewQuestions;

public class fibonacciSequence {
    //function to print fibonacci sequence using recursion
    static int n1=0;
    static int n2=1;
    static int n3=0;
    static void fib(int n){
        if(n>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
            fib(n-1);

        }
        
    }
    public static void main(String[] args) {
        System.out.print(n1+" "+n2+" ");
        fib(6);
    }
    
}
