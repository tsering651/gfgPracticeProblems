package Strings;

public class lexiographicRank {
     static final int CHAR=256;
     static int lexRank(String str) 
     { 
     int res = 1; 
     int n=str.length();
     int mul= factorial(n);
     int[] count=new int[CHAR];
     for(int i=0;i<n;i++)
         count[str.charAt(i)]++;
     for(int i=1;i<CHAR;i++)
         count[i]+=count[i-1];
     for(int i=0;i<n-1;i++){
         mul=mul/(n-i);
         res=res+count[str.charAt(i)-1]*mul;
        for(int j=str.charAt(i);j<CHAR;j++)
             count[j]--;
     } 
     return res; 
     } 
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
           return n* factorial(n-1);
        }
    }
    public static void main(String[] args) {
       // System.out.println(factorial(5));
       String str="string";
       System.out.println("Lexiographic Rank is "+lexRank(str));
    }
    
}
