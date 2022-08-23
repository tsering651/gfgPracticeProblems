public class checkPalindrome {
    //method to check a string is palindrome or not
    static boolean isPalindrome(String str,int start,int end){
        
        if(start>=end){
            return true;
        }
        return (str.charAt(start)==str.charAt(end))&&
        isPalindrome(str, start+1, end-1);
    }
    public static void main(String[] args) {
        String str="abbcbba";
        int n=str.length();
        System.out.println(isPalindrome(str, 0, n-1));
    }
}
