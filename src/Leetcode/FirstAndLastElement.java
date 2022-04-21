package Leetcode;

import java.util.Arrays;

public class FirstAndLastElement {
    public static void main(String[] args) {
        int[] arr = {2,2};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0]=firstindex(nums,target);
        arr[1]=lastindex(nums,target);

        return arr;

    }

    public static int firstindex(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==nums[mid]){
                ans=mid;
                end=mid-1;
            }
            if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return ans;
    }

    public static int lastindex(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==nums[mid]){
                ans=mid;
                start=mid+1;
            }
            if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return ans;
    }
}
