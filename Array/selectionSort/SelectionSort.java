package Array.selectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,1,4,11,14,19};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
        
    }
    public static  void SelectionSort(int[] arr){   

        for (int i=0;i<arr.length;i++){
            int last =arr.length -i-1;
            int max=FindMax(arr, 0,last);
            swap(arr ,max ,last);

        }

        
        // return -1;
    }
    public static void swap(int[] arr ,int num,int num2){
        int temp=arr[num];
        arr[num]=arr[num2];
        arr[num2 ]=temp;
    }

    public static int FindMax(int[] arr ,int start, int end){
        int max=start;
        for(int i=start; i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
                
            }
        }
        return max;
    }
    
    
}
