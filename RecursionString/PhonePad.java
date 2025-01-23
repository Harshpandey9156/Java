package RecursionString;

import java.util.ArrayList;


public class PhonePad {
    public static void main(String[] args) {


        pad(" ","12");

        ArrayList<String> list =letterCombinations("" ,"12");
        System.out.println(list);


    }
    public static ArrayList<String> letterCombinations(String p ,String up) {
        if(up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit= up.charAt(0)-'0';

        ArrayList<String> list= new ArrayList<>();

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch=(char) ( 'a'+ i);
            list.addAll(letterCombinations(p +ch,up.substring(1)));

        }
    return  list;

    }

    static void pad(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit= up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch=(char) ( 'a'+ i);
             pad(ch+p,up.substring(1));

        }
    }
}
