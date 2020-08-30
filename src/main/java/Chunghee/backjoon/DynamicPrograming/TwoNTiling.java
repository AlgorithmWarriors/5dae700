package Chunghee.backjoon.DynamicPrograming;

public class TwoNTiling {
    public int solution(int numbers) {
        if(numbers==1)return 1;
        if(numbers==2)return 2;
        int dp[] = new int[numbers+1];
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <= numbers; i++) {
            dp[i] = dp[i - 1] + dp[i-2];
        }
        return dp[numbers];
    }
}
