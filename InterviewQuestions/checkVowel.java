package InterviewQuestions;

public class checkVowel {
    //function to check if a string contains vowel or not
    static Boolean check(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="zxcvbnm";
        System.out.println(check(str));
    }
    
}
