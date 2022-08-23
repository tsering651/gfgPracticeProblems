public class ropeCutProblem {

    //method to find the maxPiece of a rope
    static int maxPiece(int n,int a,int b,int c){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        int res=Math.max(maxPiece(n-a, a, b, c), maxPiece(n-b, a, b, c));
        int mainRes=Math.max(maxPiece(n-c, a, b, c), res);

        if(mainRes==-1){
            return -1;
        }
        return mainRes+1;
    }
    public static void main(String[] args) {
        int n=23;
        int a=12;
        int b=9;
        int c=11;
        System.out.println(maxPiece(n, a, b, c));
    }
}
