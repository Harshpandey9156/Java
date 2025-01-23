package Merging;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[]  arr={7,6,4,2,1,5};
        quickSort1(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort1(int[] arr , int low, int hi){
        if(low >= hi){
            return;
        }
        int s=low;
        int end=hi;
        int mid = low + (hi - low) / 2;
        int pivot= arr[mid];


        while(s<=end){
            while(arr[s]<pivot){
                s++;
            }

            while(arr[end]>pivot){
                    end--;
                }

            if(s<=end){
                int temp =arr[s];
                arr[s]=arr[end];
                arr[end]=temp;
                s++;
                end--;

            }


        }

        quickSort1(arr,low,end);
        quickSort1(arr,s,hi);
    }
}
