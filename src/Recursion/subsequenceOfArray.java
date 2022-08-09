package Recursion;

import java.util.ArrayList;

public class subsequenceOfArray{
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> ls = new ArrayList<>();
        int n=3;
        int index=0;
        function(index,ls,arr,n);
    }
    public static void function(int ind, ArrayList ls,int[] arr,int n){
        if(ind>=n){
            System.out.println(arr);
            return;

        }
        ls.add(arr[ind]);
        function(ind+1,ls,arr,n);
        ls.remove(arr[ind]);
        function(ind+1,ls,arr,n);
    }
}
