package Chunghee.backjoon;

public class Plus1_2_3 {
    public int solution(int numbers) {
        int dp[] = new int[numbers+1];
        if(numbers==1) return 1;
        else if(numbers==2) return 2;
        else if(numbers==3) return 4;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= numbers; i++) {
            dp[i] = dp[i - 1] + dp[i-2]+dp[i-3];
        }
        return dp[numbers];
    }
}
