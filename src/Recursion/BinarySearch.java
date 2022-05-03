package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {24,46,59,69,200,749,2739,9843};
        int target = 2739;
        System.out.println(binarysearch(arr,target,0,arr.length-1));

    }
    public static int binarysearch(int[] arr, int target , int start,int end){
        if(start>end){
            return -1;
        }

        int mid = start+(end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target<arr[mid]){
            return binarysearch(arr,target,0,mid-1);
        }

        return binarysearch(arr,target,mid+1,end);
    }
}
