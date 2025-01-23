package RecursionString;

public class Stream {
    public static void main(String[] args) {
        String sr="harsh";
        String sss=sub2(sr);
        System.out.println(sss);


    }
    public static void sub(String sr,String up){
        if(up.isEmpty()){
            System.out.println(sr);
            return;
        }
         char ch= up.charAt(0);
        if(ch=='a'){
            sub(sr,up.substring(1));


        }
        else{
            sub(ch+sr,up.substring(1));
        }
    }



    public static String sub2(String up){
        if(up.isEmpty()){
//            System.out.println(up);
            return "";
        }
        char ch= up.charAt(0);
        if(ch=='a'){
            return sub2(up.substring(1));


        }
        else{
             return ch+ sub2(up.substring(1));
        }
    }
}
