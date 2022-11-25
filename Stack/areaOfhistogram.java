package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class areaOfhistogram {

    //function to find the previous smaller
    static ArrayList findPrevSmaller(int arr[]){
        int n=arr.length;
        ArrayList<Integer> ar=new ArrayList<>();
        Stack <Integer> st=new Stack<>();
        st.push(0);
        ar.add(-1);
         
        for(int i=1;i<n;i++){
             while(st.isEmpty()==false && arr[st.peek()]>=arr[i]){
                st.pop();
             }
            int res=(st.isEmpty())? -1:st.peek();
             ar.add(res);
             st.push(i);
        }
        return ar;

    }
    //function to nextSmaller in the array
    static ArrayList findNextSmaller(int arr[]){
        int n=arr.length;
        ArrayList<Integer> ar=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        ar.add(3);
        for(int i=n-2;i>=0;i--){
            while(st.isEmpty()==false && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            int res=(st.isEmpty())? 3:st.peek();
            ar.add(res);
            st.push(i);
        }
        Collections.reverse(ar);
        return ar;
    }

    //function to find the area
    static int area(int arr[]){
        int n=arr.length;
        int curr=0;
        int res=0;
        ArrayList<Integer> ps=new ArrayList<>();
        ps=findPrevSmaller(arr);

        ArrayList<Integer> ns=new ArrayList<>();
        ns=findNextSmaller(arr);
        for(int i=0;i<n;i++){
            curr=arr[i];
            curr+=(i-ps.get(i)-1)*arr[i];
            curr+=(ns.get(i)-i-1)* arr[i];
            res=Math.max(res, curr);

        }
        return res;
    }
    public static void main(String[] args) {
       // int arr[]={6,2,5,4,1,5,6};
        int arr[]={2,5,1};
     System.out.print(findPrevSmaller(arr));
        System.out.println(findNextSmaller(arr));
    System.out.println("Maximum area of the histogram is "+ area(arr));
    }
    
}
