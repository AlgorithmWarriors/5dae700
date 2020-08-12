package Chunghee.Level2;

public class Teleporting {
    public int solution(int n) {
        if(n==1||n==2)return 1;
        int[] dp = new int [n+1];
        dp[1]=dp[2]=1;
        for(int i=3;i<=n;i++){
            if(i/2*2==i)dp[i]=dp[i/2];
            else dp[i]=dp[i/2]+1;
        }
        return dp[n];
    }
}
