package Strings;

public class StringBuffer01 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
       // sb.append("Java");
       // sb.insert(1, "Java");
        // Now original string is changed
        sb.replace(1,3,"Java"); 
        System.out.println(sb);
        //System.out.println(sb);
    }
}
    

