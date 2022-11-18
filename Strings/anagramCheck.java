package Strings;

import java.util.Arrays;

public class anagramCheck {
    //check whether a string is anagram (strins s2 is anagram of s1 if all the charecters from s1 are present in s2)

    //naive appraoch
    static Boolean check1(String s1,String s2){
         if(s1.length() != s2.length()){
            return false;
         }
         char ch1[]=s1.toCharArray();
         Arrays.sort(ch1);
         s1=new String(ch1);

         char ch2[]=s2.toCharArray();
         Arrays.sort(ch2);
         s2=new String(ch2);

         return s1.equals(s2);
    }

    //efficient solution
    static final int CHAR=256;
    static Boolean check2(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
         }
         int count[]=new int[CHAR];
         for(int i=0;i<s1.length();i++){
            count[s1.charAt( i)]++;
            count[s2.charAt(i)]--;
         }
         for(int j=0;j<CHAR;j++){
            if(count[j]!=0){
                return false;
            }
         }
         return true;


    }
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        System.out.println(check1(s1, s2));
        System.out.println(check2(s1, s2));
    }
    
}
