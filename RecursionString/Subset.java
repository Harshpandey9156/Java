package RecursionString;

import java.util.ArrayList;

import java.util.List;

public class Subset {
    public static void main(String[] args) {

        int[] arr={2,4,5};
        List<List<Integer>> ans=sub(arr);
        for (List<Integer> num:ans){
            System.out.println(num);

        }


    }

    public static List<List<Integer>> sub(int[] arr){
        List<List<Integer>> outer= new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int nums:arr){
            int n=outer.size();
            for (int i=0;i<n; i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(nums);
                outer.add(internal);

            }
        }
        return outer;
    }
}
