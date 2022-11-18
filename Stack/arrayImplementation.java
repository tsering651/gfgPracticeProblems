package Stack;


class MyStack{
    static int arr[];
    static int top;
    static  int capacity;
    public MyStack(int c){
        this.capacity=c;
        top=-1;
        arr=new int[capacity];
    }

    //push operation in stack
    static void push(int n){
        if(top==capacity-1){
            System.out.println("Stack is full");
        }
        else{
            top++;
            arr[top]=n;
        }   
    
    }
    //pop operation in stack
    static int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;

        }
        else{
            int res=arr[top];
            top--;
            return res;
        }
    }
    //peek operation in stack
    static int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;

        } 
        else{
            return arr[top];
        }
    }
    static boolean isEmpty(){
        return (top==-1);
    }
    static int size(){
        return top+1;
    }

}
public class arrayImplementation {
    public static void main(String[] args) {
        MyStack st=new MyStack(5);
        st.push(3);
        st.push(90);
        st.push(23);
        System.out.println(st.size());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
    
}
