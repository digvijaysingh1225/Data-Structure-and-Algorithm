package SlidingWindow;

public class longestSubarrayOfSumK {
    public static void main(String[] args) {
        int[] arr = {4,1,1,1,2,3,5};
        int k = 5;
        System.out.println(longestSubarray(arr,k));
    }
    static int longestSubarray(int[] arr, int k){
        int i = 0;
        int j = 0;
        int max = 0;
        int sum = 0;
        while(j<arr.length){
            sum+=arr[j];
            if(sum<k){
                j++;
            }
            else if(sum == k){
                max = Math.max(max, j-i+1);
                j++;
            }
            else if(sum > k){
                while(sum>k){
                    sum-=arr[i];
                    i++;
                }
                j++;
            }

        }
        return max;
    }
}
