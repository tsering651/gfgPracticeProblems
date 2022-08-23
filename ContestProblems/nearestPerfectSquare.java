package ContestProblems;

public class nearestPerfectSquare {
         //function to check whether a number is perfect squARE or not
    static boolean check(int n){
        if((Math.sqrt(n)-Math.floor(Math.sqrt(n))) !=0){
            return false;
        }
        else{
            return true;
        }
    }
    
    public static void main(String[] args) {
       int n=30;
       //System.out.println(check(n));
       System.out.println(Math.sqrt(30));

    }
}
