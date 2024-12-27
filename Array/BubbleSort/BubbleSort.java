package Array.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length; i++){
            swapped=false;
            for(int j=1;j<arr.length;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr,(j-1),j);
                    swapped=true;
                }

            }
            if(!swapped){
                break;
            }
        }
        
        return -1;
    }
    static void swap(int arr[] ,int num1, int num2){
        if(num1==num2){
            return ;
        }
        int temp =arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;
    }
    
}
