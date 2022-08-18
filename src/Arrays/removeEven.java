package Arrays;

import java.util.Arrays;
public class removeEven {
    public static void main(String[] args) {
        int[] arr = {3,2,4,7,10,6,5};
        System.out.println(Arrays.toString(removeEven(arr)));
//        System.out.println(removeEven(arr));
    }

    static int[] removeEven(int[] arr){
        int addCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                addCount++;
            }
        }
        int[] result = new int[addCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                result[idx]=arr[i];
                idx++;
            }
        }
        return result;
    }
}
