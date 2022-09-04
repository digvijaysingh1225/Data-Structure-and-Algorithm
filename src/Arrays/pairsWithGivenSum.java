package Arrays;

/*
Find Pairs with given sum in a sorted Array

*Given an array A of size N.
*We need to find all pairs in the array that sum to a number equal to k.
*If no such pairs exists then output will be -1;

*Array element are distinct and in a sorted order.

*For example -
* arr[] = {1,2,3,4,5,6,7};   sum = 9
* Output:
* pairs(2,7)(3,6)(4,5)

 */

public class pairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,7};
        int sum = 12;

        helper(arr,sum);
    }
    static void helper(int[] arr,int sum){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(arr[start]+arr[end]<sum){
                start++;
            }
            else if(arr[start]+arr[end]>sum){
                end--;
            }
            else if(arr[start]+arr[end]==sum){
                System.out.println(arr[start]+","+arr[end]);
                start++;
                end--;
            }
        }
    }
}
