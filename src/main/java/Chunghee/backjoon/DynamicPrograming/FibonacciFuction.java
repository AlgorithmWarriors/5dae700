package Chunghee.backjoon.DynamicPrograming;

public class FibonacciFuction {
    public int[] solution(int numbers) {
    int dp[][] = {{1,0},{0,1},{0,0}};
        if(numbers==0) return dp[0];
        if(numbers==1) return dp[1];
        for (int i = 2; i <= numbers; i++) {
            dp[2][0]=dp[0][0]+dp[1][0];
            dp[2][1]=dp[0][1]+dp[1][1];
            dp[0]=dp[1];
            dp[1]=dp[2];
        }
        return dp[2];
    }
}
