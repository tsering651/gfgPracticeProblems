import java.util.Iterator;
import java.util.TreeSet;

public class treeSetInJava {
    public static void main(String[] args) {
        //treeset is the implementation of the self balancing binary search tree
            TreeSet<Integer> ts=new TreeSet<>();
            ts.add(89);
            ts.add(12);
            ts.add(11);
            ts.add(14);
            ts.add(34);
            //it prints the tree keys in sorted order
            System.out.println(ts);
            System.out.println(ts.contains(34));
            System.out.println("The lower value of 14 "+ts.lower(14));
            System.out.println("The higher value od 14 is "+ts.higher(14));
            System.out.println("The floor value of 20 is"+ ts.floor(20));
            System.out.println("The ceiling value of 20 is"+ ts.ceiling(20));
            
            //iterate the keys
            Iterator<Integer> it=ts.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }

    }
    
}
