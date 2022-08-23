public class subsetsOfString {

    static void allSubsets(String s,String current,int i){
        if(i==s.length()){
            System.out.println(current);
            return;
        }
        allSubsets(s, current, i+1);
        allSubsets(s, current+s.charAt(i), i+1);
    }
    public static void main(String[] args) {
        String s="abc";
        allSubsets(s, " ", 0);
        
    }
}
