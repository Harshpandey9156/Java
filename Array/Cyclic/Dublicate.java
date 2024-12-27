package Array.Cyclic;

public class Dublicate {


    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
         int arr1= findDuplicate(arr);
        System.out.println((arr1));
        
    }

    public static int findDuplicate(int[] arr) {
        int i=0;
        while(i<arr.length){
           
                int correct= arr[i]-1;
                if(arr[i] != arr[correct]) {
                    swap(arr , correct ,i);

                }
                else{
                    i++;
                }
            
        }

        for(int k=0 ;k<arr.length; k++){
            // int correct= k+1;
            if(arr[k]!=k+1){
                return arr[k];

            }

            
        }

        
        



        return -1;
    }
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
    
}
