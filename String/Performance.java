package String;

public class Performance {
    public static void main(String[] args) {
        String Series="";
        for(int i=0 ;i<26;i++){
            char ch=(char)('a'+i);
            // System.out.println((char)('a'+i));
            Series=Series+ch;
            
        }
        System.out.println(Series);
    }
}
