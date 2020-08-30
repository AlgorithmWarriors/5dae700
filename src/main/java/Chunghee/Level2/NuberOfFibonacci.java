package Chunghee.Level2;

public class NuberOfFibonacci {
    public int solution(int n) {
        if(n==1||n==2)return 1;
        int answer = 0;
        int first = 1;
        int Second =1;

        for(int i=3;i<=n;i++){
            answer = (first + Second)%1234567;
            first = Second;
            Second = answer;
        }
        return answer;
    }
}

