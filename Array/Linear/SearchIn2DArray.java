package Array.Linear;

import java.util.Arrays; 

public class SearchIn2DArray {
        public static void main(String[] args) {
            int[][] arr2D={
                {1,2,4,5},
                {6,7,8,9},
                {10, 11,12 ,13}
            };

            int target = 8;
            int[] ans= Search(arr2D, target);
            System.out.println(Arrays.toString(ans));

        }

        static int[] Search(int[][] arr , int target){
            for(int i=0;i<arr.length ; i++ ){
                for(int j=0;j<arr[i].length;j++){
                    if(target==arr[i][j]){
                        int[] ans={i,j};
                            return ans;
                    }
                }
            }
            return new int []{-1,-1};
        }
        
}
