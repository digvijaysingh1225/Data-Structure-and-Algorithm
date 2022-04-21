package Leetcode;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,9,10,12,14,17,19,22,24,25,27,29,30};
        int target=25;
        System.out.println(ans(arr,target));

    }

    static int ans(int[] arr, int target){
        int start=0;
        int end=1;

        while(target>arr[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
        }
        return -1;
    }

}
