package Practice;

import java.util.Scanner;

public class factorialwithoutTLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] hel = new long[1000001];
        hel[0] = 0;
        hel[1] = 1;
        for(int i = 2; i < hel.length; i++){
            hel[i] = (i*(hel[i-1]))%1000000007;
        }
        int n = sc.nextInt();
        System.out.println(hel[n]);
    }
}
