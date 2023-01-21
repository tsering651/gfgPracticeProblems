package ContestProblems;


import java.util.Stack;
public class DeleteStackMiddle {
	
	public static void getElement(Stack<Character> st,int initial,int n)
	{
		if(st.empty() || initial == n){ 
	          return; 
	      }
		char temp=st.pop();
		
		getElement(st,initial+1,n);
		
		doDelete( st, initial,n,temp);
		
	}
	static void doDelete(Stack<Character> st, int initial, int n, char element){    
	      if(initial != n/2){
	    	  st.push(element);
	      } 
	      }
	
	
	public static void main(String[]s)
	{
		Stack<Character> st=new Stack<Character>();
		st.push('a');
		st.push('b');
		st.push('c');
		st.push('d');
		st.push('e');
		System.out.println("Before deletion, the elements are:");
		System.out.println(st);
		getElement(st,0,st.size());
		System.out.println("After deletion, the elements are:");
		System.out.println(st);
	}

}


