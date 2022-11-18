package Strings;

public class anagramSearch {

    //function to check whether there exist anagram between the pattern and text given
     static final int CHAR=256;
    static Boolean isPresent(String text,String pattern){
        int n=text.length();
        int m=pattern.length();
        int CT[]=new int[CHAR];
        int CP[]=new int[CHAR];

        //filling the first window and the pattern int he array
        for(int i=0;i<m;i++){
            CT[text.charAt(i)]++;
            CP[pattern.charAt(i)]++;
        }
        for(int i=m;i<n;i++){
            if(areSame(CT,CP)){
                return true;
            }
            CT[text.charAt(i)]++;
            CT[text.charAt(i-m)]--;
        }
        return false;
        
    }
    static boolean areSame(int CT[],int CP[]){
        for(int i=0;i<CHAR;i++){
            if(CT[i]!=CP[i])return false;
        }
        return true;
        }
 public static void main(String[] args){
     String s1="geeksforgeeks";
     String s2="forg";
     System.out.println(isPresent(s1, s2));
}

}
