package Array.Binary;

public class infiniteArray {
    public static void main(String[] args) {
        
    }
    public static int ans (int[] nums , int target  ){
        int start=0;
        int end=1;

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
