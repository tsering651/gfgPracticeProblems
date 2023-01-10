import java.util.Map;
import java.util.TreeMap;

public class treeMapInJava{
    public static void main(String[] args) {
        //treemap is also a implementation of self balancing binary tree
        TreeMap<Integer,String> ts=new TreeMap<>();
        ts.put(10,"name");
        ts.put(5,"My");
        ts.put(20,"Tsering");
        ts.put(13,"is");
        System.out.println(ts);
        System.out.println(ts.containsKey(5));
        for(Map.Entry<Integer,String> e:ts.entrySet()){
                System.out.println(e.getKey()+" "+ e.getValue());
        }
        System.out.println(ts.ceilingKey(10));
        System.out.println(ts.floorKey(10));
        System.out.println(ts.higherKey(10));
        System.out.println(ts.lowerKey(10));
        System.out.println(ts.higherEntry(10).getValue());
    }
}