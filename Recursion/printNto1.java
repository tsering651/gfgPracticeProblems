public class printNto1 {
    //recursive method to print numbers from N TO 1
    static  void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    //recursive method to print numbers from 1 to n
    static void printNum2(int n){
        if(n==0){
            return;
        }
        printNum2(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        //printNum(5);
        printNum2(5);
    }
    
}
