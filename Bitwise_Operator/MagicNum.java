package Bitwise_Operator;

public class MagicNum {
    public static void main(String[] args) {
        System.out.println(magic(1));
        
    }
    public static int magic(int n){
        int ans=0;
        int base =5;
        while (n>0) {
            int last= n & 1;

            n= n >> 1;
            ans+=last*base;

            base=base*5;
            
        }






        return ans ;

    }
}
