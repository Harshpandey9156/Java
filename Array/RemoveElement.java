package Array;

public class RemoveElement {




    public int removeElement(int[] nums, int val) {
        int count =0;
        int length=nums.length;
        for(int i=0;i<nums.length;i++){
            if(val==nums[i]){
                count++;
            }
        }

        return length-count;

    }
}
