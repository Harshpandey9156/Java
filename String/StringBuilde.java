package String;

public class StringBuilde {
    public static void main(String[] args) {
        StringBuilder Builder = new StringBuilder();
        
        for(int i=0 ;i<26;i++){
            char ch=(char)('a'+i);
            // System.out.println((char)('a'+i));
            // Series=Series+ch;
            Builder.append(ch);

            
        }
        System.out.println(Builder.toString());

    }
}
