package SlidingWindow;

public class maxSumOfSubArrays {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,2,9,1,10};
        int k = 3;
        System.out.println(maxSum(arr,k));
    }
    static int maxSum(int[] arr, int k){
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while(j < arr.length){
            sum += arr[j];
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                max = Math.max(max,sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return max;
    }

}
