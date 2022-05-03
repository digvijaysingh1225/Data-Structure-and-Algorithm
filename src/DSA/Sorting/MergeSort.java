package DSA.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr={20,50,40,10} ;

        System.out.println(mergesort(arr,0,arr.length));
    }

    public static int[] mergesort(int[] arr,int start,int end){
        if(arr.length==1){
            return arr;
        }
        int mid = (start+end)/2;

        int left[] = mergesort(arr,start,mid);
        int right[] = mergesort(arr,mid+1,end);

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length+right.length];
        int i =0;
        int j =0;
        int k =0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                res[k]=left[i];
                i++;
            }
            else{
                res[k]=right[j];
                j++;
            }
            k++;
        }

        while(i<left.length){
            res[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            res[k]=right[i];
            j++;
            k++;
        }

        return res;

    }


}
