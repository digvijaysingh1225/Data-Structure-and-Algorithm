package Leetcode;

import java.util.Scanner;

public class GuessNumber {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {Scanner s = new Scanner(System.in);
        System.out.println("input number of cards : ");
        int n= s.nextInt();
//        int pick=s.nextInt();
        GuessNumber g = new GuessNumber();
        g.guessNumber(n);
    }
    public int guessNumber(int n){
        int ans=-1;
        int start=1;
        int end=n;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(guess(mid)>0){
                start=mid+1;
            }
            else if(guess(mid)<0){
                end=mid-1;
            }
            else{
                ans=mid;
                return ans;
            }

        }
        return ans;
    }

    int guess(int num){
        System.out.println("Input guess number : ");
        int pick = sc.nextInt();
        if(pick<num){
            return -1;
        }
        else if(pick>num){
            return 1;
        }
        else{
            return 0;
        }
    }



}
