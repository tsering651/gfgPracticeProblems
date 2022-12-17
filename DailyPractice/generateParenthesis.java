package DailyPractice;

import java.util.ArrayList;

public class generateParenthesis {
    //generate paranthesis
    static ArrayList<String> paren(int n){
        ArrayList<String> ar=new ArrayList<>();
        int open=0;
        int close=0;
        String res=" ";
        generate(n, open, close, res,ar);
        return ar;
    }
    static void generate(int n,int open,int close,String res,ArrayList<String> ar){
          if(close==n){
             ar.add(res);
             return;
          }
          else{
            if(open>close){
               res=res+")";
               generate(n, open, close+1, res, ar);
            }
            else{
                res=res+"(";
                generate(n, open+1, close, res, ar);
            }
          }
    }
    public static void main(String[] args) {
        int n=2;
       ArrayList<String> st=paren(n);
       System.out.println(st);


    }
    
}
