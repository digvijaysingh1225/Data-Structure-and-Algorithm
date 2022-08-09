package Recursion;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n=arr.length-1;
        funct(arr[0],arr,n);
    }
    public static void funct(int i,int arr[],int n){
        if(i<=n/2){
            return;
        }
        swap(arr[i],arr[n-i-1]);
        funct(i+1,arr,n);
    }

    private static void swap(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
    }
}



