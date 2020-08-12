package Chunghee.Level2;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer =new int[2];
        int sum =brown+yellow;
        for(int i=1;i<sum;i++){
            if(sum/i*i==sum){
                int check = 2*i+2*sum/i-4;;
                if(brown==check&&yellow==sum-check){
                    answer[0]=Math.max(i,sum/i);
                    answer[1]=Math.min(i,sum/i);
                }
            }
        }
        return answer;
    }
}
