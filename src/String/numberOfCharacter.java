package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class numberOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        method1(s);
    }
    static void method1(String s){
        Set<Character> st = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            st.add(s.charAt(i));
        }

        System.out.println(st);
    }
}
