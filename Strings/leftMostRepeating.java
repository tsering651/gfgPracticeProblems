package Strings;

public class leftMostRepeating {
    //function to find the first repeating character from the string
    static final int CHAR=256;
    static int repeatingElement(String str){
        int count[]=new int[CHAR];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<CHAR;i++){
            if(count[str.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }
    //function to find the leftmost non repeating character using naive approach
    static int nonRepeating(String str){
        for(int i=0;i<str.length()-1;i++){
            Boolean flag=false;
            for(int j=i+1;j<str.length();j++){
                 if(str.charAt(i)==str.charAt(j)){
                    flag=true;
                    break;
                 }
            }
            if(flag==false){
                return i;
               
            }
        }
        return -1;
    } 

    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println("The repeating character index is "+ repeatingElement(str));
        System.out.println("The leftmost non repaeting character is "+ nonRepeating(str));
    }
    
}
