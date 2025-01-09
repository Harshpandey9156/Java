package Math;

public class GCD {
    public static void main(String[] args) {
        System.out.println(GCD_LCM(4,8));
        System.out.println(LCM(7, 2));
    }

     static int GCD_LCM(int a , int b){
        if(a==0){
            return b;
        }

        return GCD_LCM(b%a,a);

    }
    static int LCM(int a, int b){
        return a*b / GCD_LCM(a,b);
    }
}
