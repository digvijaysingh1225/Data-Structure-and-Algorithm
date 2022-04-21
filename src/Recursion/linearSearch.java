package Recursion;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {10,39,58,68,29};
        int target = 581;
        System.out.println(search(arr,target,0));
    }
    static boolean search(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return target==arr[index]||search(arr,target,index+1);
    }
}
