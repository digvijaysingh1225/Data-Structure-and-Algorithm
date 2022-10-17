package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;

public class distinctElementInEveryWindow {
    public static void main(String[] args) {
        int[] arr = {78, 16, 94, 36, 87, 93, 50, 22, 63, 28, 91, 60, 64, 27};
        int k = 5;
        System.out.println(distinctElement(arr,k,arr.length));

    }
    static ArrayList<Integer> distinctElement(int[] arr, int k, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(j<n){
            map.put(arr[j], map.getOrDefault(arr[j],0)+1);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1 == k){
                list.add(map.size());
                j++;
            }
            if(j-i+1 > k){
                map.put(arr[i], map.get(arr[i])-1);
                if(map.get(arr[i])==0){
                    map.remove(arr[i]);
                }
                i++;
            }
        }
        return list;
    }
}
