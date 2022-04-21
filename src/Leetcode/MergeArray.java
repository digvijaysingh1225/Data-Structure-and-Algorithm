package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        int n = 1;
        int[] nums1 = {0};

        int[] nums2 = {1};

        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));

    }

    static void merge(int[] nums1, int m, int[] nums2, int n){
//        int[] nums1 = new int[m+n];
        for (int i = 0; i < n; i++) {
            nums1[i+m]+=nums2[i];

        }
        Arrays.sort(nums1);


    }
}
