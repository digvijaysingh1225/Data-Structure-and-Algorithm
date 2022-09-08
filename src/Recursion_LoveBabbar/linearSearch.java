package Recursion_LoveBabbar;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,5,1,6};
        int target = 8;
        int index = 0;
        System.out.println(linearSearch(arr,target,index));
    }
    static boolean linearSearch(int[] arr,int target,int index){

        if(index == arr.length){
            return false;
        }
        if(arr[index]==target){
            return true;
        }else {
            return linearSearch(arr, target, index + 1);
        }

    }
}
