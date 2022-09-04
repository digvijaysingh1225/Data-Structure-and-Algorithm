package Arrays;

import java.util.HashSet;
import java.util.Set;

public class duplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,4,2,6,7,7,6};
//        System.out.println(helper(arr));
        helper(arr);
    }
    static void helper(int[] arr){
        Set<Integer> set = new HashSet<>();
        boolean duplicateElement = false;

        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                duplicateElement=true;
                System.out.println(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
        if(!duplicateElement){
            System.out.println(-1);
        }
    }
}
