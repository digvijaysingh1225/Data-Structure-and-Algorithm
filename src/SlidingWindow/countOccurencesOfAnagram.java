package SlidingWindow;

import java.util.*;

//Two types of Question:
// (1) Find count of no. of occurrences of Anagrams and
// (2) find starting index of the anagrams
public class countOccurencesOfAnagram {
    public static void main(String[] args) {
        String s = "forxxooorfxxofr";
        String ptr = "for";
        System.out.println(helper(s,ptr));
    }
    static List<Integer> helper(String s, String ptr){
        List<Integer> list = new ArrayList<>();
        int k = ptr.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(ptr.charAt(i), map.getOrDefault(ptr.charAt(i),0)+1);
        }
//        int ans = 0;
        int i = 0;
        int j = 0;
        int count = map.size();
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), map.get(s.charAt(j))-1);
                if (map.get(s.charAt(j)) == 0) {
                    count--;
                }
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1 == k){
                if(count == 0){
//                    ans++;
                    list.add(i);
                }
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), map.get(s.charAt(i))+1);
                    if(map.get(s.charAt(i))==1){
                        count++;
                    }
                }

                i++;
                j++;
            }
        }
//        return ans;
        return list;
    }
}
