package Merging;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr={5,3,7,2,1};

        System.out.println(Arrays.toString(merge(arr)));

    }

    public static int[] merge(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid=arr.length/2;

        int[] left =merge(Arrays.copyOfRange(arr,0,mid));
        int[] right =merge(Arrays.copyOfRange(arr, mid,arr.length));


        return mergesort(left,right);
    }

    private static int[] mergesort(int[] left, int[] right) {




        int i=0, j=0 ,k=0;
        int[] mix=new int[left.length+right.length];

        while(i<left.length && j<right.length){
            if(left[i]>right[j]){
                mix[k]=right[j];
                k++;
                j++;

            }
            else{
                mix[k]=left[i];
                k++;
                i++;
            }

        }

        //adding the remaining array on to that
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }

        return mix;
    }
}
