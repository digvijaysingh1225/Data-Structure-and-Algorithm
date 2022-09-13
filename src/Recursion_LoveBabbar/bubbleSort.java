package Recursion_LoveBabbar;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,6,3,7,4};
        int n = arr.length;
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr,int n){
        if(n==0 || n==1){
            return;
        }

        for (int i = 0; i < n - 1 ; i++) {
            if(arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }
        }
        bubbleSort(arr,n-1);

    }
    static int[] swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

}
