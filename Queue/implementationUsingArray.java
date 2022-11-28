package Queue;


class queue{
    static int arr[];
    static int capacity;
     static int front;
    static int size;
    public queue(int c){
        arr=new int[c];
        capacity=c;
        front=0;
        size=0;
    }

    //function to check isFull or not
    static boolean isFull(){
        return (size==capacity);
    }
    //function isEmpty()
    static boolean isEmpty(){
        return (size==0);
    }
    //function to getFront
    static int getFront(){
        if(isEmpty()){
            return -1;
        }
        else{
            return arr[front];
        }
    }
    //function to getRear
    static int getRear(){
        if(isEmpty()){
            return -1;
        }
        

        else{
            int rear=(front+size-1)%capacity;
            return arr[rear] ;
        }
            
    
    }
    //enqueue operation
    static void enqueue(int x){
        if(isFull()){
            return;
        }
        else{
            int rear=getRear();
            rear=(rear+1)%capacity;
            arr[rear]=x;
            size++;
        }
    }
    //dequeue function
    static void dequeue(){
        if(isEmpty()){
            return;
        }
        else{
            front=(front+1)%capacity;
            size--;
        }
    }


}
public class implementationUsingArray {
 public static void main(String[] args) {
    queue qs=new queue(5);
    qs.enqueue(3);
    qs.enqueue(4);
    qs.enqueue(12);
    qs.enqueue(45);
    System.out.println(qs.getFront());
    System.out.println(qs.getRear());
    qs.dequeue();
    qs.dequeue();
    System.out.println(qs.getFront());
    System.out.println(qs.isEmpty());
 }
    
}
