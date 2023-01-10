import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(45);
        hs.add(23);
        hs.add(32);
        System.out.println(hs);
        System.out.println(hs.contains(32));
        System.out.println(hs.size());
        hs.remove(32);
        System.out.println(hs.size());
        Iterator<Integer> it=hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println(hs.isEmpty());
    }
    
}
