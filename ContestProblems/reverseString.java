package ContestProblems;

import java.util.Stack;

public class reverseString {

    //function to reverse a string
    static String reverse(String str){
        int n=str.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(str.charAt(i));
        }
        String res="";
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        String name="Tsering";
        System.out.println(reverse(name));
    }
    
}
