package Array.Binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array={2,4,6,7,8,10,12,14,17,19,20};
        int target= 140;
        int ans = binarySearch(array, target);
        System.out.println(ans);
        
    }

    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        

        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(arr[mid]>target){
                end=mid-1;
                
                
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else {
                return mid;
            }
        }



        return -1;
    }
    
}
