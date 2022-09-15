package Recursion_LoveBabbar;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,8,2,3,5,2,4};
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int p = partition(arr,start,end);

        quickSort(arr,start,p-1);
        quickSort(arr,p+1,end);

    }

    static int partition(int[] arr, int s, int e){
        int pivot = arr[s];
        int count = 0;

        for (int i = s+1; i <= e; i++) {
            if(arr[i]<pivot){
                count++;
            }
        }
        int pivotIndex = s+count;
        swap(arr,pivotIndex,s);

        int i = s, j = e;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<arr[pivotIndex]){
                i++;
            }
            while(arr[j]>arr[pivotIndex]){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                swap(arr,i,j);
            }
        }
        return pivotIndex;


    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
