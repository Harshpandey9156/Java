public class HammingOptimised {
    public static void main(String[] args) {

    }

    public static int HammingDistance(int[] nums){
        int hammingDistance=0;
        int bits=0;

        while(bits<32){
            int numOnes=0;
            for (int i = 0; i < nums.length; i++) {
                numOnes+=nums[i] &1;
                nums[i]=nums[i]>>1;


            }

            int numZero=nums.length-numOnes;
            hammingDistance= numZero*numOnes;
            bits++;

        }
        return  hammingDistance;

    }
}
