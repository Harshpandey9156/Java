package String;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+2));

        System.out.println("a"+1);
        //this is same after as after a few will call to string()
        // integer will be converted to Integer that will call toString()

        System.out.println("Harsh"+ new ArrayList<>());
        System.out.println("Harsh"+new Integer(34));

        String ans= new Integer(33) + "" + new ArrayList<>();
        System.out.println(ans);

    }
}
