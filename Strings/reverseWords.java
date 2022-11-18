package Strings;

public class reverseWords {

    //function to reverse a sentence 
    static char[] reverseWords(char str[]){
       
        int n=str.length;
        int start=0;
        for(int end=0;end<n;end++){
            if(str[end]==' '){
                reverse(str,start,end-1);
                start=end+1;
            }
        }
        reverse(str, start, n-1);
        reverse(str,0,n-1);
       return str;
    }
    private static void reverse(char ch[], int low, int high) {
        while(low<=high){
            char temp=ch[low];
            ch[low]=ch[high];
            ch[high]=temp;
            low++;
            high--;
        }
    }
    static void swap(int low,int high){
       
    }
    public static void main(String[] args) {
        String str="I love Coding";
        char ch[]=str.toCharArray();
   
        String s2=new String(reverseWords( ch));
        System.out.println(s2);
    }
    
}
