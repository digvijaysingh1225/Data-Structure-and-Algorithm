package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class longestSubstringLengthWithKdistinctCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(helper(s,k));
            }
    static int helper(String st,int k){
        char[] a = st.toCharArray();
        int start=0;
        Map<Character,Integer> soFar = new HashMap();
        int max = 0;

        for (int end = 0; end < st.length(); end++) {
            char rightChar = a[end];
            soFar.put(rightChar,soFar.getOrDefault(rightChar,0)+1);

//            if(!soFar.containsKey(rightChar)){
//                soFar.put(rightChar,1);
//            }
//            else{
//                soFar.put(rightChar,soFar.get(rightChar)+1);
//            }

            while (soFar.size()>k){
                char leftChar = a[start];

                if(soFar.get(leftChar)>1){
                    soFar.put(leftChar,soFar.get(leftChar)-1);
                }
                else{
                    soFar.remove(leftChar);
                }
                start++;
            }
            max = Math.max(max,(end-start)+1);
        }
        return max;

    }
}
