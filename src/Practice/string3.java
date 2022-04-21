package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class string3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String s1= s.nextLine();
//        String s2=s.nextLine();
        char[] arr1=s1.toCharArray();
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==arr1[i+1]){
                System.out.println(arr1[i] + " " + (i+1));

            }


        }
    }
}
