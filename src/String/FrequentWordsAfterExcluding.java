package String;

import java.util.*;

public class FrequentWordsAfterExcluding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] excluding = {"and","in","are"};
        System.out.println(helper(str,excluding));
    }
    static Map<String,Integer> helper(String s, String[] excluding){
        s = s.replaceAll("[^a-zA-Z0-9]"," ");
        String[] arr = s.split(" +");

        Map<String,Integer> map = new TreeMap<>();
        for (String word:
             arr) {
            word = word.toLowerCase();
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for (String exclude:
             excluding) {
            map.remove(exclude);
        }


        return map;
    }
}
