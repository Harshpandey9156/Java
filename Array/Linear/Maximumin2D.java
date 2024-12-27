package Array.Linear;
import java.util.Arrays;

public class Maximumin2D {
    public static void main(String[] args) {
        int[][] arr2D={
            {1,2,4,5},
            {6,7,8,9},
            {10, 11,12 ,13}
        };
        // int target = 8;
        int ans= Max(arr2D);
        System.out.println(ans);

        
    }
    static int  Max(int[][] arr){
        int  first =arr[0][0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                if(first< arr[i][j]){
                    first =arr[i][j];
                }
                else{
                    // return first;
                }
                
            }
            // return first;
            
        }
        return first;





        // return -1;
    }



}
