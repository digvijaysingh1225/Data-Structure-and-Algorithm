package SlidingWindow;

import java.util.HashMap;

public class smallestDistinctWindow {
    public static void main(String[] args) {
        String str = "aabcbcdbca";
        System.out.println(smallestWindow(str));
    }
    static int smallestWindow(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i), 1);
        }
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int count = map.size();
        while(j<str.length()){
            if(map.containsKey(str.charAt(j))){
                map.put(str.charAt(j), map.get(str.charAt(j))-1);
                if(map.get(str.charAt(j))==0){
                    count--;
                }
            }
            if(count == 0){
                while(count == 0){
                    min = Math.min(min, j-i+1);
                    if(map.containsKey(str.charAt(i))){
                        map.put(str.charAt(i), map.get(str.charAt(i))+1);
                        if(map.get(str.charAt(i))>0){
                            count++;
                        }
                    }
                    i++;
                }
            }
            j++;
        }
        return min;
    }
}
