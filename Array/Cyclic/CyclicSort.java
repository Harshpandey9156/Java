package Array.Cyclic;

import java.util.Arrays;
public class CyclicSort {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,9,4,5,6,7,8};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
        
        
    }

    static void cycle(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct =arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr , correct,i);
            }
            else{
                i++;
            }
         
        }
    }


    static void swap(int[] arr, int start ,int end){
        int temp =arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }




}
