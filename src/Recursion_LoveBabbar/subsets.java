package Recursion_LoveBabbar;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsets(arr));

    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsetHelper(nums,ans,new ArrayList<>(),0);
        return ans;
    }
    public static void subsetHelper(int[] arr,List<List<Integer>> ans,List<Integer> hel,int index){
        if(index == arr.length){
            ans.add(new ArrayList<>(hel));
            return;
        }
        // exclude
        subsetHelper(arr,ans,hel,index+1);
        //include
        hel.add(arr[index]);
        subsetHelper(arr,ans,hel,index+1);
        hel.remove(hel.size() - 1);

    }
}
