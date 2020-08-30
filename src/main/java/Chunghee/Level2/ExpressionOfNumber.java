package Chunghee.Level2;

public class ExpressionOfNumber {
    public int solution(int n) {
        int answer = 1;
        for(int i=2;i<n;i++){
            if(i/2*2!=i&&n%i==0&&n/i>i/2)answer++;
            if(i/2*2==i&&i/2==n%i&&n/i-n%i>0)answer++;
        }
        return answer;
    }
}
