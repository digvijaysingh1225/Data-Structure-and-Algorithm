package DSA.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr={20,50,40,10} ;
        bro(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void bro(int[] arr,int start, int end){

        if(arr.length<=1){
            return ;
        }
        int mid=(start+end)/2 ;
        int[] left=new int[mid] ;
        int[] right=new int[(end+1)-mid] ;
        for(int i=0;i<mid;i++){
            left[i]=arr[i] ;
        }
        int i=-1 ;
        for(int j=mid;j<=end;j++){
            right[++i]=arr[j] ;

        }
//        System.out.println(Arrays.toString(left));
//        System.out.println(Arrays.toString(right));
        bro(left,0,mid-1) ;
        bro(right,mid,end) ;
        merge(arr,left,right) ;
    }
    static void merge(int[] arr,int[] left,int[] right){
        int i=0 ;
        int j=0 ;
        int k=0 ;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k]=left[i] ;
                i++ ;
                k++ ;
            }
            else{
                arr[k]=right[j] ;
                j++ ;
                k++ ;
            }

        }
        while(i<left.length){
            arr[k]=left[i] ;
            i++ ;
            k++ ;
        }
        while(j<right.length){
            arr[k]=right[j] ;
            j++ ;
            k++ ;
        }
    }
}
