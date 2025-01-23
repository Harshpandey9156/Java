package Recursion.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReturnArraylist    {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] arr={1,2,4,5,7,7,7,8,9};
        int target =7;
        System.out.println(function(arr,target,0,list));


    }

    public static ArrayList<Integer> function(int[] arr , int target , int index , ArrayList<Integer> list){
        if(arr.length==index){
            return list;
        }
        if(arr[index]==target){
             list.add(index);
        }
        return  function(arr,target,index+1,list);
    }

}

