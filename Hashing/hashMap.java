import java.util.HashMap;
import java.util.Map;

public class hashMap {
  public static void main(String[] args) {

    HashMap<Integer,String> mp=new HashMap<>();
    mp.put(1, "Tsering");
    mp.put(2,"Lobsang");
    mp.put(3,"Sonu");
    System.out.println(mp);
    System.out.println(mp.containsKey(4));
    System.out.println(mp.containsValue("Wangchu"));
    System.out.println(mp.get(2));
    mp.remove(3);
    for(Map.Entry<Integer,String> e: mp.entrySet()){
        System.out.println(e.getKey()+" "+ e.getValue());
    }
    System.out.println(mp.size());
    
  }
    
}