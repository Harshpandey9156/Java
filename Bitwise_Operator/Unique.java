package Bitwise_Operator;

public class Unique {
    public static void main(String[] args) {
        int[] arr={2,4,5,2,4,5,6,7,5,7,5};
        System.out.println(Unique(arr));
        
    }



    public static int Unique(int[] arr){
        int ans=0;

        for (int n:arr){
            ans ^=n;

        }
        
        return ans;

    }
}
