package Array;

public class MergingArray {


    public void merge(int[] nums1, int m, int[] nums2, int n) {



        for(int i=0; i<nums1.length;i++){
            for(int j=0 ;j<nums2.length;j++)
                if(nums1[i]==0){
                    nums1[i]=nums2[j];
                }



        }

        for(int i=0;i<nums1.length;i++){
//            int max=nums1[0];
            if(nums1[i]>nums1[i+1]){
                int temp= nums1[i];
                nums1[i]=nums1[i+1];
                nums1[i+1]=temp;

            }


        }

    }
}
