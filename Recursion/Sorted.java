package Recursion;

import java.util.ArrayList;

public class Sorted    {
    public static void main(String[] args) {
        int[] arr={2,4,7,92,10,15,18};
        int index=0;
        System.out.println(sorted(arr,index));
    }
    static ArrayList<Integer> list= new ArrayList<>();

    static  boolean sorted(int[] arr ,int index )
    {
        if(index==arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1]  && sorted(arr,index+1);
    }
}
