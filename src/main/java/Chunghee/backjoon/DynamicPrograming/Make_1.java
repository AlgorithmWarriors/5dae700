package Chunghee.backjoon.DynamicPrograming;


public class Make_1 {
    public int solution(int numbers) {
        int dp[] = new int[numbers+1];
        dp[0]= dp[1] = 0;
        for (int i = 2; i <= numbers; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }
        return dp[numbers];
    }
}
