package Array.Cyclic;
import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        
        System.out.println(Arrays.toString(Missing(arr)));
        
    }
    public static int[] Missing(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct =arr[i]-1;
            if( arr[correct]!=arr[i]){
                // if(arr[i]<arr.length){
                    swap(arr , correct,i);
                // }

                
                // 
            }
            else{
                i++;
            }   
        }
        for (int j=0; j<arr.length;j++){
            if(arr[j]!=j+1){
                return new int[]{arr[j],j+1};

            }

        }
        return new int[]{-1 ,-1};
    }
    static void swap(int[] arr, int start ,int end){
        int temp =arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }

}
