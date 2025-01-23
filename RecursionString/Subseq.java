package RecursionString;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        String st= "abc";
         sub1("",st);
        ArrayList<String> list =new ArrayList<>();
        list=sub1("", st);
        System.out.println(list);



    }

    public  static void sub(String s,String up){
        if(up.isEmpty()){
            System.out.println(s);
            return;
        }

        char ch=up.charAt(0);
        sub(s+ch,up.substring(1));
        sub(s,up.substring(1));
    }



    public  static ArrayList<String> sub1(String s,String up ){
        if(up.isEmpty()){
//            System.out.println(s);
            ArrayList<String> list= new ArrayList<>();
            list.add(s);
            return list;

        }

        char ch=up.charAt(0);
        ArrayList<String> left=sub1(s+ch,up.substring(1));
        ArrayList<String> right= sub1(s,up.substring(1));

        left.addAll(right);
        return left;
    }
}
