package Practice;

import java.util.Arrays;

public class LinearSearch1 {

    // Ques: Find the element in Array.

    public static void main(String[] args) {
// int[] arr= {1,2,3,4,5};
// int target=3;
//
// int ans=searchArr(arr,target);
// System.out.println(ans);
// String str = "sdfghjk";
// char target = 'd';
//
//
// System.out.println(stringSearch(str,target));
        int[][] arr = {
                {1,2,3},
                {4,5,6,7},
                {8,9,10,11}
        };
        int target=123;
//        int[] ans=searchin2Darray(arr,target);
        System.out.println(Arrays.toString(searchin2Darray(arr,target)));


    }



    //Search in array
//    static int searchArr(int[] arr, int target){
//        if(arr.length==0){
//            System.out.println("Element Found ");
////            return false;
//        }
//        int i=0;
//        for (i = 0; i < arr.length; i++) {
//            if(arr[i]==target){
//                System.out.print("Element Found at index : ");
////                return i;
//            }
//        }
//        return false;
//        return i;
//    }

    //Search in String
//    static boolean stringSearch(String str, char target){
//        if(str.length()==0){
//            return false;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i)==target){
//                return true;
//            }
//        }
//
//        return false;
//    }

    static int[] searchin2Darray(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};


    }

}
