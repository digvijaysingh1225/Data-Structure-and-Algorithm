package DynamicProgramming;

public class subsetSum {
    public static void main(String[] args) {
        int[] arr = {2,3,7,8,10};
        int sum = 31;
        int n = arr.length;
        System.out.println(subsetSum_fun(arr,sum,n));
    }

    public static boolean subsetSum_fun(int[] arr,int sum,int n){
        boolean[][] dp = new boolean[n+1][sum+1];

        for (int i = 0; i < n + 1 ; i++) {
            dp[i][0]=true;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
