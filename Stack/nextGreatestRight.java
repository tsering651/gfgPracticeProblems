package Stack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class nextGreatestRight {
    //function to print the nest greatest element from the right
    static ArrayList nextGreatest(int arr[]){
        int n=arr.length;
        ArrayList<Integer> ar=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        s.push(arr[n-1]);
        ar.add(-1);
        for(int i=n-2;i>=0;i--){
            while(s.isEmpty()==false && s.peek()<=arr[i]){
                s.pop();
            }
            int nextGreatest=(s.isEmpty())? -1:s.peek();
            ar.add(nextGreatest);
            s.push(arr[i]);
        }
        Collections.reverse(ar);
        return ar;

    }
    public static void main(String[] args) {
        int arr[]={5,15,10,8,6,12,9,18};
        // ArrayList<Integer> result=new ArrayList<>();
        //  result=;
        
        System.out.println(nextGreatest(arr));
        
    //    System.out.println( nextGreatest(arr));
    }
    
}
