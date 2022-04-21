package BinarySearch;

import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {

        int[] arr = {3,2,4};
        int target=6;
        System.out.println(Arrays.toString(twosum(arr,target)));

//        System.out.println(Arrays.toString(optimizetwosum(arr, target)));
    }

    public static int[] twosum(int[] arr, int target){
//        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
//                        System.out.println(i + " " + j);
                        return new int[]{i,j};
                }

            }
        }

//        return -1;
        return new int[]{-1,-1};
    }

    static int[] optimizetwosum(int[] arr, int target){
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            if (arr[start] + arr[end] == target) {
                return new int[]{start+1, end+1};
            } else if (arr[start] + arr[end] < target) {
                start++;
            } else if (arr[start] + arr[end] > target) {
                end--;
            }
        }
        return new int[]{-1,-1};
    }


}
