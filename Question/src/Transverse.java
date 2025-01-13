public class Transverse   {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        transves(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//        System.out.println("hello");
    }

    static void transves(int[][] matrix) {
//        int[][] ans= new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = i+1; j < matrix[i].length; j++) {
               swap(matrix,i,j,j,i);

            }

        }

        for (int i = 0; i < matrix.length ; i++){
                for (int j = 0; j < matrix.length; j++) {
                    reverseRows(matrix);

            }


        }



//


    }
    static void swap(int[][] arr,int r1 ,int c1,int r2,int c2){
        int temp=arr[r1][c1];
        arr[r1][c1]=arr[r2][c2];
        arr[r2][c2]=temp;
    }
    public static void reverseRows(int[][] matrix) {
        for (int[] row : matrix) {
            int start = 0;
            int end = row.length - 1;
            while (start < end) {
                // Swap elements
                int temp = row[start];
                row[start] = row[end];
                row[end] = temp;
                start++;
                end--;
            }
        }
    }

}
