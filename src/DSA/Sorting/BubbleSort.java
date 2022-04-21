package DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        String str = "The quick brown fox jump over the luck lazy little dog";
        String[] arr;
        arr = str.split(" ");
        String temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {

                if(arr[j].length()>arr[j+1].length()){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if(arr[j].length()==arr[j+1].length()){

                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
