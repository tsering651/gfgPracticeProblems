package Strings;

public class subsequenceString {

    //check if a string is a subsequence of the other string
    static Boolean checkSubsequence(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        if(n<m){
            return false;
        }
        int j=0;
        for(int i=0;i<n && j<m;i++){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
        }
        return (j==m);
    }
    //recursive solution
    static Boolean check(String s1,String s2,int n,int m){
        
        if(m==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
             return check(s1,s2,n-1,m-1);
        }
        else{
           return check(s1, s2, n-1, m);
        }
    }
    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="gfg";
        System.out.println(checkSubsequence(s1, s2));
        System.out.println(check(s1, s2, s1.length(), s2.length()));
    }
    
}
