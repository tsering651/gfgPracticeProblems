package Stack;


import java.util.Stack;

public class nextGreatestLeft {
    //function to print the next greatest on left side 
    static void printGreatest(int arr[]){
        int n=arr.length;
        // Deque<Integer> ds=new Array
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        System.out.print("-1"+" ");
        for(int i=1;i<n;i++){
            while(st.isEmpty()==false && st.peek()<=arr[i]){
                st.pop();
            }
            int pr=(st.isEmpty())? -1:st.peek();
            System.out.print(pr+ " ");
            st.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={15,10,18,12,4,6,2,8};
        printGreatest(arr);
    }
    
}
