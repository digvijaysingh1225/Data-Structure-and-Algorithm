package SlidingWindow;

import java.util.HashMap;

public class longestSubstringwithKUniqueCharacter {
    public static void main(String[] args) {
        String s = "aaaaa"; //aabacbebebe  k=3
        int k = 2;
        System.out.println(longestSubstring(s, k));
    }
    static int longestSubstring(String s, int k){
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = -1;
        while(j<s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
            if(map.size()<k){
                j++;
            }
            else if(map.size() == k){
                max = Math.max(max, j-i+1);
                j++;
            }
            else if(map.size()>k){
                while(map.size()>k){
                    map.put(s.charAt(i), map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i))==0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
