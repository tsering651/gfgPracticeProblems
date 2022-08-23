public class kthbitSet {

    //check if the kth bit is set or not
    static void checkKthbit(int n,int k){
        if((n & (1<<(k-1)) )!=0){
              System.out.print("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    //method to check using right shift
    static void rightShiftkCheck(int n,int k){
        if(((n>>(k-1))& 1)==1){
            System.out.println("Yes");

        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        int n=8;
        int k=2;
      //  checkKthbit(n,k);
        rightShiftkCheck(n, k);
        
    }
}
