package Recursion_LoveBabbar;

public class arraySum {
    public static void main(String[] args) {
        int[] arr = {3,2,5,1,6};
//        int sum = 0;
        int index = arr.length-1;
        System.out.println(arraySum(arr,index));
    }
    static int arraySum(int[] arr,int index){
        if(index==0){
            return arr[index];
        }
        int ans = arraySum(arr,index-1);
        int sum = arr[index]+ans;
        return sum;

    }
}
