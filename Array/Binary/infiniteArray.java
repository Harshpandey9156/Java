package Array.Binary;

public class infiniteArray {
    public static void main(String[] args) {
        int[] arr={2,3,9,5,6,7,8,5,3};
        System.out.println(ans(arr,6));
        
    }
    public static int ans (int[] nums , int target   ){
        int start=0;
        int end=1;

        int mid= start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }

        if(target>nums[end]){
            int temp =end+1;
            //doubling the size of the box
             end=end+ (end-start+1)*2;
             start=temp;
        }





        return binarySearch(nums , target,start,end);
    }
    public static int binarySearch(int[] nums ,int target ,int start ,int end){
        return 0;

        
    }
}
