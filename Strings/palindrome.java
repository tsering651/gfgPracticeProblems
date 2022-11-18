package Strings;

public class palindrome {

    //naive solution
    static Boolean checkPalindrome(String str){
        StringBuilder rev=new StringBuilder(str);
        rev.reverse();
        return str.contains(rev.toString());
    }
    //efficient solution
    static Boolean check(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                  return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="abcdcba";
        //System.out.println(checkPalindrome(str));
        System.out.println(check(str));
    }
    
}
