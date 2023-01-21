package ContestProblems;


import java.util.Stack;

public class insertIntheMiddleStack {

    //delete a midddle element from the given stack
    static void insertMiddle(Stack<Integer> s,int size,int newElement){
        int arr[]=new int[size/2];
        for(int i=0;i<size/2;i++){
            arr[i]=s.pop();
        }
        s.push(newElement);
      int n=arr.length;
      for(int i=n-1;i>=0;i--){
          s.push(arr[i]);
      }

      while(!s.isEmpty()){
        System.out.println(s.pop());
      }


    }
  public static void main(String[] args) {
      Stack<Integer> s=new Stack<>();
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);
      s.push(8);
      insertMiddle(s, s.size(), 10);
  }
    
}
