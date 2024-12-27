package Array.Linear;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr={23, 34, 5, 6,11, 12 ,3,2};
        int target =62;
        int  index=linearSearch(arr, target);
        System.out.println(index);
        boolean  index1=linearSearch3(arr, target);
        System.out.println(index1);
        
    }
    //return the boolean values
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length==0){
            return false;

        }
        for(int i = 0 ;i<arr.length; i++){
            if(arr[i]==target){
                return true;
            }
        }
               return false;

    }


    //searching the index of the value
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;

        }
        for(int i = 0 ;i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
               return -1;

    }
    
}
