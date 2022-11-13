package Practice;

import java.util.Scanner;

public class UltimateSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextInt();
            long ans = 0;
            if(n%2 == 0){
                ans = n/2;
            }
            else{
                ans = n/2 + 1;
            }
            System.out.println(ans);
        }
    }
}
