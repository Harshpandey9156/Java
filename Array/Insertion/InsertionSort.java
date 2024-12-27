package Array.Insertion;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {

        int[] arr={2,4,6,8,1,4,11,14,19};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
    public static void swap(int[] arr ,int num,int num2){
        int temp=arr[num];
        arr[num]=arr[num2];
        arr[num2 ]=temp;
    }

    public static void Insertion(int[] arr){
        for(int i=0 ; i<arr.length-1; i++){
            for (int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
}
