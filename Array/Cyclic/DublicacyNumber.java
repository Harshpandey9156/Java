package Array.Cyclic;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class DublicacyNumber {
    public static void main(String[] args) {

                int[] arr={4,0,1,2};
                
                
                
                System.out.println(Arrays.toString(arr));
    }

    public List<Integer> findDisappearedNumbers(int[] arr) {

        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[correct] != arr[i]) {
                swap(arr, correct, i);

            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != (j + 1)) {
                // ans.add(j+1);
                ans.add(j + 1);
            }

        }
        return ans;

    }

    void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
}