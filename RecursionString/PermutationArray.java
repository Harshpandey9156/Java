package RecursionString;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PermutationArray {
    public static void main(String[] args) {
        ArrayList<String> ans= permutat("" , "abc");

    }
    public static ArrayList<String> permutat(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch= up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f= p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutat( f+ch+s,up.substring(1)));


        }
        return  ans;


    }
}
