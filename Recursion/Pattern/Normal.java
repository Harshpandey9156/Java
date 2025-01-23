package Recursion.Pattern;

public class Normal    {
    public static void main(String[] args) {
         pattern1(4);
//        System.out.println(n);


    }

    public static void pattern1(int n){
        if (n == 0) {
            return;
        }

        for(int i=0;i<n ; i++){
            System.out.print("*");


        }
        System.out.println();

         pattern1(n-1);
    }

}
