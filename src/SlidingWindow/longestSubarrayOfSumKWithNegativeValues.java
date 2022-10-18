package SlidingWindow;

import java.util.HashMap;

public class longestSubarrayOfSumKWithNegativeValues {
    public static void main(String[] args) {
        int[] arr = {-13, 0, 6, 15, 16, 2 ,15, -12, 17, -16, 0 ,-3, 19, -3, 2, -9, -6};
        int k = 15;
        System.out.println(longestSubarrayWithNegative(arr,k));
    }
    static int longestSubarrayWithNegative(int[] arr, int k){
        int i = 0;
        int sum = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(i < arr.length){
            sum += arr[i];
            if(sum == k){
                max = i+1;
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
            if(map.containsKey(sum - k)){
                max = Math.max(max, i - map.get(sum - k));
            }
            i++;
        }
        return max;
    }
}
