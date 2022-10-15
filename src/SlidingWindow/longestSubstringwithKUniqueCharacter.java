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

// Problem of Pick Toys is same as this problem
// PS: There is a boy who have to pick the maximum amount of toys stored in a reck.
// There are two conditions are given in this problem:
// (i) He has to pick the toys which are stored in a line.
// (ii) and he can pick only two different types of toys but can pick any no. of toys of same type.
// Given a String s = "abaccab" and k = 2 (which is fixed);
//
