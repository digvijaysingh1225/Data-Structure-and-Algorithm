package SlidingWindow;

import java.util.HashMap;

public class minimumWindowSubstring {
    public static void main(String[] args) {
        String s = "TOTMTAPTAT";
        String t = "TTA";
        System.out.println(minimumWindow(s,t));
    }
    static int minimumWindow(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int count = map.size();
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))==0){
                    count--;
                }
            }
            if(count==0){
                while(count == 0){
                    min = Math.min(min, j-i+1);
                    if(map.containsKey(s.charAt(i))){
                        map.put(s.charAt(i),map.get(s.charAt(i))+1);
                        if(map.get(s.charAt(i))>0){
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
