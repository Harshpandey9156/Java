public class HammingDistance   {
    public static void main(String[] args) {
        int[] n={2,14,4};
        int n1=totalHammingDistance(n);
        System.out.println(n1);

    }


    static int totalHammingDistance(int[] nums) {
        int n;
        int x=0;
        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1;j<nums.length;j++){
                x+= Integer.bitCount(nums[i] ^nums[j]);
            }

        }


        return x;
    }
}
