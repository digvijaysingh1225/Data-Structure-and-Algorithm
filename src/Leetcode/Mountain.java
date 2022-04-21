package Leetcode;

public class Mountain {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,6,2,0};
        System.out.println(peakValue(arr));

    }
    static int peakValue(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
        return start;
    }
}
