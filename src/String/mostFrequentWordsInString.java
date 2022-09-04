package String;

import java.util.*;

public class mostFrequentWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // Best items in category are Samsung and Lenovo. Samsung items are nice and Lenovo items are good.

        System.out.println(helper(str));
    }
    static List<String> helper(String s){
        s = s.replaceAll("[^a-zA-Z0-9]"," ");
        String[] arr = s.split(" +");

        Map<String,Integer> map = new HashMap<>(); //TreeMap helps to sort content of map Alphabetically.But only if all character are either lowercase or uppercase.
        for (String words:arr) {
            words = words.toLowerCase();
            map.put(words, map.getOrDefault(words, 0) + 1);

        }


        TreeMap<String,Integer> mostFrequent = new TreeMap<>((e1,e2) -> {
            int freq1 = map.get(e1);
            int freq2 = map.get(e2);

            if(freq1!=freq2){
                return freq2-freq1;
            }
            return e1.compareTo(e2);
        });
        mostFrequent.putAll(map);
        List<String> mostFrequentWords = new ArrayList<>();
        int topFreq = mostFrequent.firstEntry().getValue();

        while(!mostFrequent.isEmpty()){
            Map.Entry<String, Integer> word = mostFrequent.pollFirstEntry();

            if(word.getValue() == topFreq){
                mostFrequentWords.add(word.getKey());
            }
            else
                break;
        }
        return mostFrequentWords;
        
    }
}
