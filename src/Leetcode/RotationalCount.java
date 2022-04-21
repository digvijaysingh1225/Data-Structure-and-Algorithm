package Leetcode;

public class RotationalCount {
    public static void main(String[] args) {
        int[] arr = {9,11,1,3,5,7};
        System.out.println(rotationalcount(arr));
    }

    static int rotationalcount(int[] arr){
        int pivot = findpivot(arr);
        return pivot+1;
    }

    static int findpivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(mid<=end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>=start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
