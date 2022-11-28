package Stack;
import java.util.*;


public class postfixEvaluation {

    //function that evaluates the postfix expression
    //Character.isDigit()-->this methods check whether the character is number or not
    // static int postFix(String str){
    //     int n=str.length();
    //     Stack<Character> st=new Stack<>();
    //     for(int i=0;i<n;i++){
    //         if(Character.isDigit(str.charAt(i))){
    //             st.push(str.charAt(i));
    //         }
    //         else{
    //             if(st.isEmpty()==false){
    //                 int op1=st.pop();
    //                 int op2=st.pop();

    //                 int compute= op2 +str.charAt(i)+ op1;
    //             }
    //         }
    //     }

    // }
    public static void main(String[] args) {
        String str="4abc";
        boolean check=Character.isDigit(str.charAt(1));
        System.out.println(check);
    }
}
