package Chunghee.Level2;

public class juxtapositionTable {
    public int solution(int n, int a, int b)
    {
        int right = Math.max(a,b);
        int left =  Math.min(a,b);
        int answer = 1;
        while (true){
            if(right-left==1&&right/2*2==right)break;
            if(right/2*2!=right)right++;
            if(left/2*2!=left)left++;
            right /=2;
            left /=2;
            answer++;
        }
        return answer;
    }
}
