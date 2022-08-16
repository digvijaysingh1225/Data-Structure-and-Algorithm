package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class longestsSubstringLengthWithNoRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(helper(s));
    }
    static int helper(String st){
        int start,end;
        start=end=0;
        int max=0;
        Map<Character,Integer> map = new HashMap<>();

        while(end < st.length()){
            char currentChar = st.charAt(end);

            if(map.containsKey(currentChar)){
                start=Math.max(start,map.get(currentChar)+1);
            }
            map.put(currentChar,end);
            max = Math.max(max,(end-start)+1);
            end++;
        }
        return max;
    }
}
