package DynamicProgramming;
import java.util.Arrays;

public class knapsack {
    public static void main(String[] args) {
        int[] wt = {1,3,4,7};
        int[] val = {1,4,5,7};
        int n = 4;
        int W = 15;
        System.out.println(recursion(wt,val,W,n));
        System.out.println(memo(wt,val,W,n));
        System.out.println(top_down(wt,val,W,n));

    }
    // Returns the maximum weight a knapsack can hold.
    static int recursion(int[] wt,int[] val,int W,int n){
        if(n==0 || W==0){
            return 0;
        }
        if(wt[n-1]<=W){
            return Math.max(val[n-1]+recursion(wt,val,W-wt[n-1],n-1),recursion(wt,val,W,n-1));
        }
        return recursion(wt,val,W,n-1);
    }

    static int[][] dp = new int[102][1002];
    static int memo(int[] wt,int[] val,int W,int n){
        for (int[] arr :
                dp) {
            Arrays.fill(arr,-1);
        }
        return memo_helper(wt,val,W,n);
    }

    static int memo_helper(int[] wt,int[] val,int W,int n){
        if(n==0 || W==0){
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }

        if(wt[n-1]<=W){
            return dp[n][W] = Math.max(val[n-1]+memo_helper(wt,val,W-wt[n-1],n-1),memo_helper(wt,val,W,n-1));
        }
        return dp[n][W] = memo_helper(wt,val,W,n-1);
    }

    static int top_down(int[] wt,int[] val, int W,int n){
        int dp[][] = new int[n+1][W+1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(wt[i-1]<=j){
                    dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];
    }


}
