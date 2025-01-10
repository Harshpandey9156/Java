package Recursion;

public class Sorted    {
    public static void main(String[] args) {
        int[] arr={2,4,7,9,10,15,18};
        int index=0;
        System.out.println(sorted(arr,index));
    }

    static  boolean sorted(int[] arr ,int index )
    {
        if(index==arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1]  && sorted(arr,index+1);
    }
}
