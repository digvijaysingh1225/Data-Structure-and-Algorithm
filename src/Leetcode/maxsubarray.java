package Leetcode;

public class maxsubarray {
    public static void main(String[] args) {
        int[] arr = {-1,2,4,-3,6,-4};

        System.out.println(subarray(arr));

    }

    static int subarray(int[] nums){
//        int[] arr1 = new int[nums.length];
        int sum=0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }

        }
        return max;

    }
}
