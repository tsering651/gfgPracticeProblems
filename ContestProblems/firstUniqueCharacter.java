package ContestProblems;

import java.util.HashMap;

public class firstUniqueCharacter {
    static void print(String str){
        int n=str.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(str.charAt(i),mp.getOrDefault(str.charAt(i), 0)+1);
        }
        for(int i=0;i<n;i++){
            if(mp.get(str.charAt(i))==1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
   public static void main(String[] args) {
       String str="abcdebadf";
       print(str);
   }
    
}
