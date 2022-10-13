package SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Arrays;

public class maximumOfAllSubarraysOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1,3,1,2,0,5};
        int k = 3;
        int n = arr.length;
        System.out.println(Arrays.toString(maximumSubarray(arr, k, n)));
    }
    static int[] maximumSubarray(int[] arr, int k, int n){
        int[] res = new int[n-k+1];
        Deque<Integer> list = new LinkedList<>();
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        while(j<n){
            if(arr[j]>max){
                max = arr[j];
            }
            while(!list.isEmpty() && list.peek()<arr[j]){
                list.remove();
            }
            list.push(arr[j]);
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                res[i] = list.peekLast();
                if(arr[i]==list.peekLast()){
                    list.removeLast();
                }
                i++;
                j++;
            }

        }
        return res;
    }
}
