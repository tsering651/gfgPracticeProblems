package Stack;

import java.util.Stack;

public class stockSpan {

    //function to print the span of the stocks on a given day
    static void printSpan(int arr[]){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        st.push(0);
        System.out.print(1 + " ");
        int span=0;
        for(int i=1;i<n;i++){
              while(st.isEmpty()==false && arr[st.peek()]<=arr[i]){
                        st.pop();
              }
              span=(st.isEmpty())? i+1 : i-st.peek();
              System.out.print(span +" ");
              st.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[]={30,20,25,28,120};
        printSpan(arr); 
    }
    
}
