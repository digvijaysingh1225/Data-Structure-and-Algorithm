package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class frequencyOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // Best items in category are Samsung and Lenovo. Samsung items are nice and Lenovo items are good.

        System.out.println(method1(str));
    }

    static Map<String,Integer> method1(String s){
        s = s.replaceAll("[^a-zA-Z0-9]"," ");
        String[] arr = s.split(" +");

        Map<String,Integer> map = new TreeMap<>(); //TreeMap helps to sort content of map Alphabetically.But only if all character are either lowercase or uppercase.
        for (String words:arr) {
            words = words.toUpperCase();
            map.put(words,map.getOrDefault(words,0)+1);
        }

        return map;
    }
}
