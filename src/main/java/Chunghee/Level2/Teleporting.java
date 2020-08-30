package Chunghee.Level2;

public class Teleporting {
    public int solution(int n) {
        int answer = 1;

        while (n!=1){
            answer += n%2;
            n/=2;
        }
        return answer;
    }
}
