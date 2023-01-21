import java.util.Stack;

public class reverseString {
    //function to reverse the string
    static String reverse(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        String rev="";
       
        while(!st.isEmpty()){
            rev+=st.pop();
        }

        return rev;
    }
    public static void main(String[] args) {
        String str="Tsering";
        reverse(str);
    }
    
}
