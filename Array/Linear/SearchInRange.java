package Array.Linear;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={2,34,23,45,6,7,8,9,11};
        int target=11;
        int start=2;
        int end=5;
        int ans =LinearSearch(arr, target, start, end);
        System.out.println(ans);
        
    }

    //search the element in the range of 1 to 4 for example in that range you have to search the element
    static int LinearSearch(int[] arr, int target ,int start ,int end){
        if(arr.length==0){
            return -1;

        }
        for(int i=start ;i<=end; i++){
            if(arr[i]==target){
                return i;
            }
        }


        return -1;
    }
    
}
