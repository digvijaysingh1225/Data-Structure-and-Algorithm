package SlidingWindow;

import java.util.LinkedList;


public class firstNegativeNumberInWindowSizeK {
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-15,30,18,28};
        int k = 3;
        firstNegativeNumber(arr,k);
    }
    static void firstNegativeNumber(int[] arr, int k){
        int i = 0;
        int j = 0;
        LinkedList<Integer> list = new LinkedList<>();
        while(j<arr.length){
            if(arr[j]<0){
                list.add(arr[j]);
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1 == k){
                if(list.isEmpty()){
                    System.out.print("0"+" ");
                }
                else{
                    System.out.print(list.peek()+" ");
                    if(arr[i]==list.peek()){
                        list.pop();
                    }
                }
                i++;
                j++;
            }
        }
    }
}
