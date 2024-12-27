package String;

public class Palin {
    public static void main(String[] args) {
        String str="abcdcba";
        System.out.println(Palindrome(str) );
        
    }
    public static boolean Palindrome(String str){
        str=str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++){
            int start= str.charAt(i);
            int end = (str.charAt(str.length()-1-i));
            if(start!=end){
                return false;
            }


        }
        return true;
    }
    
}
