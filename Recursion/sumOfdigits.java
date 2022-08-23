public class sumOfdigits {

    //method to find the sum of the digit
    static int findSum(int n){
        if(n==0){
            return 0;
        }
        return findSum(n/10)+(n%10);
    }
    //iterative solution for solving the same problem(more optimized)
    static int sum(int n){
        int res=0;
        while(n>=0){
            res=res+(n%10);
            n=n/10;
        }
        return res;
    }
    public static void main(String[] args) {
        int n=9987;
        System.out.println(findSum(n));
        System.out.println(sum(n));
    }
}
