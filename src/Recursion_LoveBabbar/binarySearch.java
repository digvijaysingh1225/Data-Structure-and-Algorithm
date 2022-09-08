package Recursion_LoveBabbar;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,10};
        int target = 11;
        int start = 0;
        int end = arr.length-1;
        System.out.println(binarySearch(arr,target,start,end));
    }
    static boolean binarySearch(int[] arr, int target,int start,int end){
        if(start>end){
            return false;
        }
        int mid = start + (end-start)/2;
        if(arr[mid]==target)
            return true;
        else if(target<arr[mid])
            return binarySearch(arr,target,start,mid-1);
        else
            return binarySearch(arr,target,mid+1,end);
    }
}
