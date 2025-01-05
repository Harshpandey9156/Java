package Resurssion;

public class BinarySearchRecurssion {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,8,9,22,45};
        int target=7;
        System.out.println(binary(arr, target,0,arr.length-1));
        
    }
    static int binary(int[] arr, int target ,int start ,int end){
        if(start>end){
            return  -1;
        }
        int mid= start+(end-start)/2;

        if(target ==arr[mid]){
            return mid;
        }
        else if(arr[mid]>target){
           return binary(arr, target, start, mid-1);
        }
        else{
            return binary(arr, target, mid+1, end);
        }
        
    }
}
