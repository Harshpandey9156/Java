package Array.Linear;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums ={12,345,2,6,7896};
        System.out.println(findNumbers(nums));


        
    }

    static int findNumbers(int[] nums) {
        int count=0;
        
        for(int num :nums){

            if(even(num)){
                count++;
            }

        }   
        return count; 
    }


    public static boolean even(int nums){
        int CountDigits=digits(nums);
        if(CountDigits%2==0){
            return true;
        }
        return false;
       
  
}

static int digits(int  nums){
    int count=0;
    while(nums>0){
        count++;
        nums=nums/10;
    }
    return count;
}

}
