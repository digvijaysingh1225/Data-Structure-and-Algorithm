package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersect(nums1,nums2)));

    }

    static int[] intersect(int[] nums1,int[] nums2){

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    nums2[j]=-1;
                    break;
                }
            }

        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=list.get(i);
        }
        return arr;
    }
}
