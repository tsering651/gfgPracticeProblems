package InterviewQuestions;

public class checkForPalindrome {
    //function to check for  palindrome of a string
    static Boolean isPalindrome(String str){
        int n=str.length();
        int low=0;
        int high=n-1;
        while(low<high){
            if(str.charAt(low)==str.charAt(high)){
                low++;
                high--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="tsering";
        System.out.println(isPalindrome(str));
    }
    
}
